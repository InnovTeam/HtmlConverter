package com.convert.core.html.processor;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.convert.core.Html;
import com.convert.core.OutputTemplate;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class PostProcessor {
  private final String TEMPLATE_FILE = "page.ftl";
  public void  output(){
    final Configuration configuration = OutputTemplate.getConfiguration();
    final Document doc = Html.getHtml();
    try {
      Map<String, Object> data = new HashMap<String, Object>();
      Template templateHtml = configuration.getTemplate(TEMPLATE_FILE);
      Elements links = doc.getElementsByTag("script");
      data.put("javascripts", links);
      Elements styles = doc.getElementsByTag("link");
      data.put("styles", styles);
      StringWriter writer = new StringWriter();
      doc.select("script, style, meta, link, comment, CDATA, #comment").remove();
      data.put("body", doc.body().html().replaceAll("<body>", "").replaceAll("</body>", ""));
      templateHtml.process(data, writer);
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (TemplateException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

}
