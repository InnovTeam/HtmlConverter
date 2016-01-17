package com.convert.core;

import com.sun.codemodel.JCodeModel;

public abstract class Model extends Process {
  private static JCodeModel codeModel;

  public static JCodeModel getModel() {
    if (codeModel == null) {
      codeModel = new JCodeModel();
    }
    return codeModel;
  }

}
