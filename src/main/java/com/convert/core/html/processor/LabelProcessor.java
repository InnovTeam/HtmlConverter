package com.convert.core.html.processor;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.convert.core.Html;
import com.convert.core.OutputTemplate;
import com.convert.core.Settings;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class LabelProcessor extends HtmlProcessor {
  private final String TEMPLATE_FILE = "label.ftl";
  private final String FIELD = "label";
  @Override
  public void process() throws TemplateException {
    final Configuration configuration = OutputTemplate.getConfiguration();
    final Document doc = Html.getHtml();
    try {
      final Elements labels = doc.select(FIELD);
      Properties prop = new Properties();
      Template templateLabels = configuration.getTemplate(Settings.BASE_TEMPLATE_DIR+"/"+Settings.VERSION+"/"+TEMPLATE_FILE);
      OutputStream output = new FileOutputStream(Settings.propertyFileName);
      Map<String, Object> data = new HashMap<String, Object>();
      for (Element label : labels) {
        if (label.hasText()) {
          String labelName = label.attr("for");
          String pageNameText = Settings.JSP_PAGENAME + "."+FIELD+"."+labelName;
          prop.setProperty(pageNameText, label.text());
          data.put("labelName", pageNameText);
          StringWriter writer = new StringWriter();
          templateLabels.process(data, writer);
          label.html(writer.getBuffer().toString());
        }
      }

      // save properties to project root folder
      prop.store(output, null);
      successor.process();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

}
