package com.convert.core;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public abstract class Html extends Process {
  private static Document html;
  private Map<String, List<String>> selects;

  public Map<String, List<String>> getSelects() {
    return selects;
  }

  public static Document getHtml() {

    if (html == null) {
      try {
        InputStream is = Html.class.getResourceAsStream(Settings.HTML_FILENAME);
        html = Jsoup.parse(is, "UTF-8", "");
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return html;

  }

  public abstract void invoke();

}
