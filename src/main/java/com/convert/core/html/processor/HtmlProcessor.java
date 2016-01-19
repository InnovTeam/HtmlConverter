package com.convert.core.html.processor;

import freemarker.template.TemplateException;


public abstract class HtmlProcessor {
  protected HtmlProcessor successor;

  public void setSuccessor(HtmlProcessor successor) {
    this.successor = successor;
  }

  abstract public void process()  throws TemplateException;
}
