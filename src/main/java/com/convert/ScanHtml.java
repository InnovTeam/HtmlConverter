package com.convert;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import com.sun.codemodel.ClassType;
import com.sun.codemodel.JBlock;
import com.sun.codemodel.JClassAlreadyExistsException;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JEnumConstant;
import com.sun.codemodel.JExpr;
import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JMod;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class ScanHtml {

  /**
   * @param args
   */
  public static void main(String[] args) {
    // Freemarker configuration object
    Configuration cfg = new Configuration();
    try {
      Document doc = Jsoup.parse(new File("./src/identification.html"), "UTF-8");

      // Load template from source folder
      Template template = cfg.getTemplate("src/com/convert/template/jsp/struts2.ftl");

      // Build the data-model
      Map<String, Object> data = new HashMap<String, Object>();
      final String pageName = "identification";

      data.put("pageName", pageName);

      // get select tags

      Elements selectTags = doc.getElementsByTag("select");
      for (Element selectTag : selectTags) {
        JCodeModel codeModel = new JCodeModel();
        String enumName = StringUtils.capitalize(selectTag.attr("id") + "Type");
        // String enumName=selectTag.attr("id")+"Type";
        System.out.println(enumName);
        JDefinedClass enumClass = codeModel._class("com.foo." + enumName, ClassType.ENUM);
        JFieldVar field1 = enumClass.field(JMod.PRIVATE | JMod.FINAL, String.class, "column");
        JMethod enumConstructor = enumClass.constructor(JMod.PRIVATE);
        enumConstructor.param(String.class, "column");
        enumConstructor.body().assign(JExpr._this().ref("column"), JExpr.ref("column"));
        Elements options = selectTag.select("option");
        for (Element element : options) {
          String text = element.text();
          if (!text.contains("GenerateSelectHtml")) {

            JEnumConstant enumConst = enumClass.enumConstant(text.toUpperCase());
            enumConst.arg(JExpr.lit(text));
          }

        }
        String mehtodName = "get" + enumName;
        JMethod jmCreate = enumClass
            .method(JMod.PUBLIC | JMod.STATIC, java.util.ArrayList.class, "create" + mehtodName);
        JBlock jBlock = jmCreate.body();
        jBlock.directStatement("List<String> list = new ArrayList<String>();"
            + " for (SalutationsType value : SalutationsType.values()) {" + "list.add(value.getSalutation());" + "} " +

            "return list");
        codeModel.build(new File("src"));
      }

      // generateEnum();

      Elements links = doc.getElementsByTag("script");
      data.put("javascripts", links);
      Elements styles = doc.getElementsByTag("link");
      data.put("styles", styles);
      // links.remove();
      Elements labels = doc.select("label");
      Properties prop = new Properties();
      OutputStream output = null;
      output = new FileOutputStream("config.properties");
      Template templateLabels = cfg.getTemplate("src/com/convert/template/label/struts2.ftl");
      for (Element label : labels) {
        if (label.hasText()) {
          String labelName = label.attr("for");
          String pageNameText = pageName + ".label." + labelName;
          prop.setProperty(pageNameText, label.text());
          data.put("labelName", label.text());
          StringWriter writer = new StringWriter();
          // Writer out = new OutputStreamWriter(System.out);
          templateLabels.process(data, writer);
          // out.flush();
          label.html(writer.getBuffer().toString());

        }
      }

      // save properties to project root folder
      prop.store(output, null);

      doc.select("script, style, meta, link, comment, CDATA, #comment").remove();
      // removeComments(doc);
      // doc.body().html().replaceAll("<body>", "").replaceAll("</body>",
      // "");

      data.put("body", doc.body().html().replaceAll("<body>", "").replaceAll("</body>", ""));
      /*
       * for (Element link : links) { System.out.println(link); }
       */

      // Console output
      /*
       * Writer out = new OutputStreamWriter(System.out); template.process(data,
       * out); out.flush();
       */
      // File output
      Writer file = new FileWriter(new File("FTL_helloworld.jsp"));
      template.process(data, file);
      file.flush();
      file.close();

    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (TemplateException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (JClassAlreadyExistsException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

  private static void generateEnum() throws JClassAlreadyExistsException, IOException {
    JCodeModel codeModel = new JCodeModel();
    JDefinedClass enumClass = codeModel._class("com.foo.Bar", ClassType.ENUM);
    // This code creates field within the enum class
    JFieldVar columnField = enumClass.field(JMod.PRIVATE | JMod.FINAL, String.class, "column");
    JFieldVar filterableField = enumClass.field(JMod.PRIVATE | JMod.FINAL, codeModel.BOOLEAN, "filterable");

    // Define the enum constructor
    JMethod enumConstructor = enumClass.constructor(JMod.PRIVATE);
    enumConstructor.param(String.class, "column");
    enumConstructor.param(codeModel.BOOLEAN, "filterable");
    enumConstructor.body().assign(JExpr._this().ref("column"), JExpr.ref("column"));
    enumConstructor.body().assign(JExpr._this().ref("filterable"), JExpr.ref("filterable"));

    JMethod getterColumnMethod = enumClass.method(JMod.PUBLIC, String.class, "getColumn");
    getterColumnMethod.body()._return(columnField);
    JMethod getterFilterMethod = enumClass.method(JMod.PUBLIC, codeModel.BOOLEAN, "isFilterable");
    getterFilterMethod.body()._return(filterableField);

    JEnumConstant enumConst = enumClass.enumConstant("FOO_BAR");
    enumConst.arg(JExpr.lit("fooBar"));
    enumConst.arg(JExpr.lit(true));
    codeModel.build(new File("src"));
    /*
     * //creating an enum class within our main class JDefinedClass enumClass =
     * codeModel._class(JMod.PUBLIC, "REPORT_COLUMNS"); //This code creates
     * field within the enum class JFieldVar columnField =
     * enumClass.field(JMod.PRIVATE|JMod.FINAL, String.class, "column");
     * JFieldVar filterableField = enumClass.field(JMod.PRIVATE|JMod.FINAL,
     * codeModel.BOOLEAN, "filterable");
     */
  }

  private static void getSelectTags() {

  }

  private static void removeComments(Node node) {
    for (int i = 0; i < node.childNodes().size();) {
      Node child = node.childNode(i);
      if (child.nodeName().equals("#comment"))
        child.remove();
      else {
        removeComments(child);
        i++;
      }
    }
  }

}
