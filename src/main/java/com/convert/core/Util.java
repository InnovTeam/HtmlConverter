package com.convert.core;

import org.apache.commons.lang3.StringUtils;

public class Util {
  public static String getEnumClassName(String name){
    return StringUtils.capitalize(name + "Type");    
  }

}
