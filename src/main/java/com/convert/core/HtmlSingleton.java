package com.convert.core;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HtmlSingleton {
  private static Document html;

  private HtmlSingleton() {
  }

  public static Document getHtml() {
    return html;
  }

  public static Document setHTMLFile(InputStream is) {
    if (html == null) {
      try {
        html = Jsoup.parse(is, "UTF-8", "");
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return html;
  }

  public static Map<String, List<String>> getAllSelectOptions() {
    final Elements selectTags = html.getElementsByTag("select");
    final Map<String, List<String>> selectList = new HashMap<String, List<String>>();
    for (Element selectTag : selectTags) {
      final String enumName = StringUtils.capitalize(selectTag.attr("id") + "Type");
      System.out.println(enumName);
      Elements options = selectTag.select("option");
      final List<String> optionValues = new ArrayList<String>();
      for (Element element : options) {
        final String optionText = element.text();
        if (!optionText.contains("Select")) {
          optionValues.add(optionText);
        }
      }
      selectList.put(enumName, optionValues);
    }
    return selectList;

  }
}
