package com.convert.core.html.processor;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.convert.core.Html;
import com.convert.core.OutputTemplate;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class InputProcessor extends HtmlProcessor {
  private final String INPUT_TEMPLATE_FILE = "input.ftl";
  private final String FIELD = "input";

  @Override
  public void process() throws TemplateException {
    final Configuration configuration = OutputTemplate.getConfiguration();
    final Document doc = Html.getHtml();
    final Elements inputs = doc.select(FIELD);
    try {
    	Map<String, Object> data = new HashMap<String, Object>();
    	for(Element input : inputs){
    		if(!input.attr("type").equals("button")){
    			final String inputId = input.attr("id");
    			final String inputCss = input.attr("class");
    			final String inputPlaceholder = input.attr("placeholder");
    			Template templateInputs = configuration.getTemplate(INPUT_TEMPLATE_FILE);
    			data.put("inputId", inputId);
    			data.put("inputCss", inputCss);
    			data.put("inputPlaceholder", inputPlaceholder);
    			StringWriter writer = new StringWriter();
    			templateInputs.process(data, writer);
    			input.after(writer.getBuffer().toString());
    			input.remove();
    		}
    	}
    	successor.process();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
  }

}
