package com.convert.core.html.processor;

import java.io.IOException;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.convert.core.Html;
import com.convert.core.OutputTemplate;
import com.convert.core.Settings;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class InputProcessor extends HtmlProcessor {
  private final String INPUT_TEMPLATE_FILE = "input.ftl";
  private final String FIELD = "input";

  @Override
  public void process() {
    final Configuration configuration = OutputTemplate.getConfiguration();
    final Document doc = Html.getHtml();
    final Elements inputs = doc.select(FIELD);
    try {
      Template templateInputs = configuration.getTemplate(Settings.BASE_TEMPLATE_DIR+"/"+Settings.VERSION+"/"+INPUT_TEMPLATE_FILE);
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
  }

}
