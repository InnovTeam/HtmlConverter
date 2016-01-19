package com.convert.core.model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang3.StringUtils;

import com.convert.core.Model;
import com.sun.codemodel.ClassType;
import com.sun.codemodel.JBlock;
import com.sun.codemodel.JClass;
import com.sun.codemodel.JClassAlreadyExistsException;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JExpr;
import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.JForEach;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JMod;
import com.sun.codemodel.JVar;

public class GenerateSelectModel extends Model {

  @Override
  public void invoke() {
    final Map<String, List<String>> selects = getSettings().getSelectList();
    for (Entry<String, List<String>> entry : selects.entrySet()) {
      final String enumName = entry.getKey();
      final List<String> values = entry.getValue();
      JDefinedClass enumClass;
      try {
        enumClass = getModel()._package("com.convert.model.select")._class(JMod.PUBLIC, enumName, ClassType.ENUM);
        for (String value : values) {
          enumClass.enumConstant(StringUtils.capitalize(value)).arg(JExpr.lit(value));
        }
        JFieldVar enumField = enumClass.field(JMod.PRIVATE, String.class, "value");
        JMethod enumConstructor = enumClass.constructor(JMod.PRIVATE);
        enumConstructor.param(String.class, "value");
        enumConstructor.body().assign(JExpr._this().ref("value"), JExpr.ref("value"));
        JMethod getterColumnMethod = enumClass.method(JMod.PUBLIC, String.class, "get" + enumField.name());
        getterColumnMethod.body()._return(enumField);
        JClass arrayListclass = getModel().ref(ArrayList.class);
        JClass listclass = getModel().ref(List.class);
        JMethod getterEnumMethod = enumClass.method(JMod.PUBLIC | JMod.STATIC, listclass.narrow(String.class), "get"
            + enumClass.name());
        final JBlock body = getterEnumMethod.body();
        body.decl(listclass.narrow(String.class), "list", JExpr._new(arrayListclass.narrow(String.class)));
        JClass enumClassRef = getModel().ref(enumClass.name());
        JForEach foreach = body.forEach(enumClassRef, "value", enumClassRef.staticInvoke("values"));
        JVar $count1 = foreach.var();
        foreach.body().add(JExpr.ref("list").invoke("add").arg($count1.invoke(getterColumnMethod.name())));
        body._return(JExpr.ref("list"));
        getModel().build(new File("src/main/java"));
        
      } catch (JClassAlreadyExistsException e) {
        e.printStackTrace();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}