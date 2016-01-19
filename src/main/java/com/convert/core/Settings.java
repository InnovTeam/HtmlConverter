package com.convert.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Settings {
  final static Map<String, List<String>> selectList = new HashMap<String, List<String>>();
  public static final String HTML_FILENAME="identification.html";
  public static final String JSP_PAGENAME="identification";
  public static final String propertyFileName="src/main/resources/config.properties";
  public static final String BASE_TEMPLATE_DIR="src/main/resources/template";
  public static final String VERSION="struts2";
  
  public Map<String, List<String>> getSelectList() {
    return selectList;
  }

}
