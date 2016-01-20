package com.convert.core.html.processor;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang3.StringUtils;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.convert.core.Html;
import com.convert.core.Model;
import com.convert.core.OutputTemplate;
import com.convert.core.Settings;
import com.convert.core.Util;
import com.sun.codemodel.ClassType;
import com.sun.codemodel.JBlock;
import com.sun.codemodel.JClass;
import com.sun.codemodel.JClassAlreadyExistsException;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JExpr;
import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.JForEach;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JMod;
import com.sun.codemodel.JVar;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class SelectProcessor extends HtmlProcessor{
	  private final String TEMPLATE_FILE = "select.ftl";
	  private final String FIELD = "select";
	  private final String OPTION_FIELD = "option";
	@Override
	public void process() throws TemplateException {
		final Configuration configuration = OutputTemplate.getConfiguration();
	    final Elements selectTags = Html.getHtml().getElementsByTag(FIELD);
	    final Map<String, List<String>> selectList = new HashMap<String, List<String>>();
	    for (Element selectTag : selectTags) {
	      final String enumName = Util.getEnumClassName(selectTag.attr("id"));
	      Elements options = selectTag.select(OPTION_FIELD);
	      final List<String> optionValues = new ArrayList<String>();
	      for (Element element : options) {
	        final String optionText = element.text();
	        if (!optionText.contains("Select")) {
	          optionValues.add(optionText);
	        }
	      }
	      selectList.put(enumName, optionValues);
	    }

	    try {
	    	final Map<String,String> templateList = new HashMap<String, String>();
	    for (Entry<String, List<String>> entry : selectList.entrySet()) {
	      final String enumName = entry.getKey();
	      final List<String> values = entry.getValue();
	    	  JDefinedClass enumClass = Model.getModel()._package(Settings.SELECT_DIR)._class(JMod.PUBLIC, enumName, ClassType.ENUM);
	        for (String value : values) {
	          enumClass.enumConstant(StringUtils.capitalize(value)).arg(JExpr.lit(value));
	        }
	        
	        JFieldVar enumField = enumClass.field(JMod.PRIVATE, String.class, "value");
	        JMethod enumConstructor = enumClass.constructor(JMod.PRIVATE);
	        enumConstructor.param(String.class, "value");
	        enumConstructor.body().assign(JExpr._this().ref("value"), JExpr.ref("value"));
	        JMethod getterColumnMethod = enumClass.method(JMod.PUBLIC, String.class, "get" + enumField.name());
	        getterColumnMethod.body()._return(enumField);
	        JClass arrayListclass = Model.getModel().ref(ArrayList.class);
	        JClass listclass = Model.getModel().ref(List.class);
	        JMethod getterEnumMethod = enumClass.method(JMod.PUBLIC | JMod.STATIC, listclass.narrow(String.class), "get"
	            + enumClass.name());
	        String listClass="@"+enumClass.fullName()+"@"+getterEnumMethod.name()+"()";
	        templateList.put(enumName, listClass);
	        final JBlock body = getterEnumMethod.body();
	        body.decl(listclass.narrow(String.class), "list", JExpr._new(arrayListclass.narrow(String.class)));
	        JClass enumClassRef = Model.getModel().ref(enumClass.name());
	        JForEach foreach = body.forEach(enumClassRef, "value", enumClassRef.staticInvoke("values"));
	        JVar $count1 = foreach.var();
	        foreach.body().add(JExpr.ref("list").invoke("add").arg($count1.invoke(getterColumnMethod.name())));
	        body._return(JExpr.ref("list"));
	        Model.getModel().build(new File("src/main/java"));
	      
	    }
	    Map<String, Object> data = new HashMap<String, Object>();
	    
        Template templateLabels = configuration.getTemplate(TEMPLATE_FILE);
        for (Element selectTag : selectTags) {
        	final String selectId = selectTag.attr("id");
        	final String enumName = Util.getEnumClassName(selectId);
			final String selectCss = selectTag.attr("class");
        	data.put("selectId", selectId);
        	data.put("cssClass", selectCss);
        	final String modelClass = templateList.get(enumName);
        	data.put("modelClass", modelClass);
        	data.put("pageName", Settings.JSP_PAGENAME);
        	StringWriter writer = new StringWriter();
            templateLabels.process(data, writer);
            selectTag.after(writer.getBuffer().toString());
            selectTag.remove();
        }
      
	    } catch (JClassAlreadyExistsException e) {
	        e.printStackTrace();
	      } catch (IOException e) {
	        e.printStackTrace();
	      }
	    
	    
	  
		
	}

}
