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
        FileTemplateLoader ftl = new FileTemplateLoader(new File("/tmp/templates"));
       // FileTemplateLoader ftl2 = new FileTemplateLoader(new File("/usr/data/templates"));
        TemplateLoader[] loaders = new TemplateLoader[] { ftl};
        MultiTemplateLoader mtl = new MultiTemplateLoader(loaders);
        cfg.setTemplateLoader(mtl);
      }
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return cfg;

  }
}
