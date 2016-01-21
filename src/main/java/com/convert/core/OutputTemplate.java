package com.convert.core;

import java.io.File;
import java.io.IOException;

import freemarker.cache.FileTemplateLoader;
import freemarker.cache.MultiTemplateLoader;
import freemarker.cache.TemplateLoader;
import freemarker.template.Configuration;

public abstract class OutputTemplate {
  private static Configuration cfg = null;

  public static Configuration getConfiguration() {
    try {
      if(cfg == null){
        cfg = new Configuration();
      }
      ClassLoader cl = Thread.currentThread().getContextClassLoader();
      FileTemplateLoader ftl = new FileTemplateLoader(new File(cl.getResource(Settings.BASE_TEMPLATE_DIR+"/"+Settings.VERSION).getFile()));
      TemplateLoader[] loaders = new TemplateLoader[] { ftl};
      MultiTemplateLoader mtl = new MultiTemplateLoader(loaders);
      cfg.setTemplateLoader(mtl);
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return cfg;

  }
}
