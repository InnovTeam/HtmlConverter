package com.convert.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Settings {
  final static Map<String, List<String>> selectList = new HashMap<String, List<String>>();
  private String htmlFileName;
  private String jspPageName;
  private String propertyFileName;

  public String getHtmlFileName() {
    return htmlFileName;
  }

  public void setHtmlFileName(String htmlFileName) {
    this.htmlFileName = htmlFileName;
  }

  public String getJspPageName() {
    return jspPageName;
  }

  public void setJspPageName(String jspPageName) {
    this.jspPageName = jspPageName;
  }

  /**
   * @return the propertyFileName
   */
  public String getPropertyFileName() {
    return propertyFileName;
  }

  /**
   * @param propertyFileName
   *          the propertyFileName to set
   */
  public void setPropertyFileName(String propertyFileName) {
    this.propertyFileName = propertyFileName;
  }

  public Map<String, List<String>> getSelectList() {
    return selectList;
  }

}
