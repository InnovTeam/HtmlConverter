package com.convert.core;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public abstract class Html extends Process {
  private static Document html;

  public static Document getHtml() {

    if (html == null) {
      try {
        //ClassLoader cl = Thread.currentThread().getContextClassLoader();
        //final File file = new File(cl.getResource(Settings.HTML_FILENAME).getFile());
        InputStream is = Html.class.getResourceAsStream(Settings.HTML_FILENAME);
        html = Jsoup.parse(is, "UTF-8", "");
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return html;

  }
}
