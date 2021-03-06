package com.convert;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import com.convert.core.Html;
import com.convert.core.html.processor.HtmlProcessor;
import com.convert.core.html.processor.InputProcessor;
import com.convert.core.html.processor.LabelProcessor;
import com.convert.core.html.processor.PostProcessor;
import com.convert.core.html.processor.SelectProcessor;

public class ModifiedScanHtml {

  /**
   * @param args
   * @throws IOException 
   */
  public static void main(String[] args) throws Exception {
	final HtmlProcessor labelProcessor = new LabelProcessor();
    final HtmlProcessor inputProcessor = new InputProcessor();
    final HtmlProcessor selectProcessor = new SelectProcessor();
    labelProcessor.setSuccessor(inputProcessor);
    inputProcessor.setSuccessor(selectProcessor);
    labelProcessor.process();
    final PostProcessor postProcessor = new PostProcessor();
    postProcessor.output();
    final String html = Html.getHtml().html();
    Writer file = new FileWriter(new File("helloworld.jsp"));
    file.write(html);
    file.flush();
    file.close();
    
    /*final ProcessTemplate processTemplate = new ProcessTemplate();
    processTemplate.setSettings(htmlSettings);
    processTemplate.addProcess(new GenerateSelectHtml()).addProcess(new GenerateSelectModel()).addProcess(new GenerateProperties());
    processTemplate.execute();
    Configuration cfg = new Configuration();*/
    
    /*
     * try { Document doc = Jsoup.parse(new File("./src/identification.html"),
     * "UTF-8");
     * 
     * // Load template from source folder OutputTemplate template =
     * cfg.getTemplate("src/com/convert/template/jsp/struts2.ftl");
     * 
     * // Build the data-model Map<String, Object> data = new HashMap<String,
     * Object>(); final String pageName = "identification";
     * 
     * data.put("pageName", pageName);
     * 
     * // get select tags
     * 
     * Elements selectTags = doc.getElementsByTag("select"); for (Element
     * selectTag : selectTags) { JCodeModel codeModel = new JCodeModel(); String
     * enumName = StringUtils.capitalize(selectTag.attr("id") + "Type"); //
     * String enumName=selectTag.attr("id")+"Type";
     * System.out.println(enumName); JDefinedClass enumClass =
     * codeModel._class("com.foo." + enumName, ClassType.ENUM); JFieldVar field1
     * = enumClass.field(JMod.PRIVATE | JMod.FINAL, String.class, "column");
     * JMethod enumConstructor = enumClass.constructor(JMod.PRIVATE);
     * enumConstructor.param(String.class, "column");
     * enumConstructor.body().assign(JExpr._this().ref("column"),
     * JExpr.ref("column")); Elements options = selectTag.select("option"); for
     * (Element element : options) { String text = element.text(); if
     * (!text.contains("GenerateSelectHtml")) {
     * 
     * JEnumConstant enumConst = enumClass.enumConstant(text.toUpperCase());
     * enumConst.arg(JExpr.lit(text)); }
     * 
     * } String mehtodName = "get" + enumName; JMethod jmCreate = enumClass
     * .method(JMod.PUBLIC | JMod.STATIC, java.util.ArrayList.class, "create" +
     * mehtodName); JBlock jBlock = jmCreate.body();
     * jBlock.directStatement("List<String> list = new ArrayList<String>();" +
     * " for (SalutationsType value : SalutationsType.values()) {" +
     * "list.add(value.getSalutation());" + "} " +
     * 
     * "return list"); codeModel.build(new File("src")); }
     * 
     * 
     * Elements links = doc.getElementsByTag("script"); data.put("javascripts",
     * links); Elements styles = doc.getElementsByTag("link");
     * data.put("styles", styles); // links.remove(); Elements labels =
     * doc.select("label"); Properties prop = new Properties(); OutputStream
     * output = null; output = new FileOutputStream("config.properties");
     * OutputTemplate templateLabels =
     * cfg.getTemplate("src/com/convert/template/label/struts2.ftl"); for
     * (Element label : labels) { if (label.hasText()) { String labelName =
     * label.attr("for"); String pageNameText = pageName + ".label." +
     * labelName; prop.setProperty(pageNameText, label.text());
     * data.put("labelName", label.text()); StringWriter writer = new
     * StringWriter(); // Writer out = new OutputStreamWriter(System.out);
     * templateLabels.process(data, writer); // out.flush();
     * label.html(writer.getBuffer().toString());
     * 
     * } }
     * 
     * // save properties to project root folder prop.store(output, null);
     * 
     * doc.select("script, style, meta, link, comment, CDATA, #comment").remove()
     * ; // removeComments(doc); // doc.body().html().replaceAll("<body>",
     * "").replaceAll("</body>", // "");
     * 
     * data.put("body", doc.body().html().replaceAll("<body>",
     * "").replaceAll("</body>", ""));
     * 
     * for (Element link : links) { System.out.println(link); }
     * 
     * 
     * // Console output
     * 
     * Writer out = new OutputStreamWriter(System.out); template.process(data,
     * out); out.flush();
     * 
     * // File output Writer file = new FileWriter(new
     * File("FTL_helloworld.jsp")); template.process(data, file); file.flush();
     * file.close();
     * 
     * } catch (IOException e) { // TODO Auto-generated catch block
     * e.printStackTrace(); } catch (TemplateException e) { // TODO
     * Auto-generated catch block e.printStackTrace(); } catch
     * (JClassAlreadyExistsException e) { // TODO Auto-generated catch block
     * e.printStackTrace(); }
     */

  }

}
