package com.convert.core;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public abstract class Html extends Process {
  private Document html;
  private Map<String, List<String>> selects;

  public Map<String, List<String>> getSelects() {
    return selects;
  }

  protected Document getHtml() {

    if (html == null) {
      try {
        InputStream is = Html.class.getResourceAsStream(getSettings().getHtmlFileName());
        html = Jsoup.parse(is, "UTF-8", "");
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return html;

  }

  public abstract void invoke();

}
