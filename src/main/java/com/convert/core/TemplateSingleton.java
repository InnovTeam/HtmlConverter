package com.convert.core;

import java.io.File;
import java.io.IOException;

import freemarker.cache.FileTemplateLoader;
import freemarker.cache.MultiTemplateLoader;
import freemarker.cache.TemplateLoader;
import freemarker.template.Configuration;

public class TemplateSingleton {
  private static Configuration cfg = new Configuration();

  public static void load() {
    FileTemplateLoader ftl1;
    try {
      ftl1 = new FileTemplateLoader(new File("/tmp/templates"));
      FileTemplateLoader ftl2 = new FileTemplateLoader(new File("/usr/data/templates"));
      TemplateLoader[] loaders = new TemplateLoader[] { ftl1, ftl2 };
      MultiTemplateLoader mtl = new MultiTemplateLoader(loaders);

      cfg.setTemplateLoader(mtl);
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }
}
