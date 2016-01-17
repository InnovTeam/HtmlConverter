package com.convert.core.html;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.convert.core.Html;

public class SelectHtml extends Html {

  @Override
  public void invoke() {
    final Elements selectTags = getHtml().getElementsByTag("select");
    final Map<String, List<String>> selectList = getSettings().getSelectList();
    for (Element selectTag : selectTags) {
      final String enumName = StringUtils.capitalize(selectTag.attr("id") + "Type");
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

  }

}
