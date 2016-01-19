package com.convert.core.html;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.convert.core.Html;
import com.convert.core.Settings;

public class GenerateProperties extends Html {
  Properties prop = new Properties();
  private final String LABEL = "label";

  @Override
  public void invoke() {
    final Elements labels = getHtml().select(LABEL);
    OutputStream output;
    try {
      output = new FileOutputStream(Settings.propertyFileName);
      final String pageName = Settings.JSP_PAGENAME;
      for (Element label : labels) {
        if (label.hasText()) {
          String labelName = label.attr("for");
          String pageNameText = pageName + "." + LABEL + "." + labelName;
          prop.setProperty(pageNameText, label.text());
        }
      }
      prop.store(output, pageName + " ui properties");
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

}
