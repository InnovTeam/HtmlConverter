package com.convert.model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.sun.codemodel.ClassType;
import com.sun.codemodel.JBlock;
import com.sun.codemodel.JClass;
import com.sun.codemodel.JClassAlreadyExistsException;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JEnumConstant;
import com.sun.codemodel.JExpr;
import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.JForEach;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JMod;
import com.sun.codemodel.JVar;

public class GenerateModel {
	
	public static void main(String[] args) throws JClassAlreadyExistsException, IOException {
		GenerateModel.selectToEnum();
	}
	
	public static void selectToEnum() throws JClassAlreadyExistsException, IOException{
		final JCodeModel jCodeModel = new JCodeModel();
		final JDefinedClass enumClass = jCodeModel._package("com.foo")._class(JMod.PUBLIC,"SalutationType",ClassType.ENUM);
		final JEnumConstant enumMonth = enumClass.enumConstant("MR");
		enumMonth.arg(JExpr.lit("Mr."));
		//Creating private fields in the class
        JFieldVar enumField = enumClass.field(JMod.PRIVATE, String.class, "value");
        //Define the enum constructor
        JMethod enumConstructor = enumClass.constructor(JMod.PRIVATE);
        enumConstructor.param(String.class, "value");
        enumConstructor.body().assign(JExpr._this().ref("value"), JExpr.ref("value"));
        
        JMethod getterColumnMethod = enumClass.method(JMod.PUBLIC, String.class, "get"+enumField.name());
        getterColumnMethod.body()._return(enumField);
        
        JClass arrayListclass = jCodeModel.ref(ArrayList.class);
        JClass listclass = jCodeModel.ref(List.class);
        JMethod getterEnumMethod = enumClass.method(JMod.PUBLIC | JMod.STATIC, listclass.narrow(String.class), "get"+enumClass.name());
        final JBlock body = getterEnumMethod.body();
    	JVar list = body.decl(listclass.narrow(String.class), "list",
    			JExpr._new(arrayListclass.narrow(String.class)));
    	JClass enumClassRef = jCodeModel.ref(enumClass.name());
    	JForEach foreach = body.forEach(enumClassRef, "value", enumClassRef.staticInvoke("values"));
    	JVar $count1 = foreach.var();
		foreach.body().add(JExpr.ref("list").invoke("add").arg($count1.invoke(getterColumnMethod.name())));
		body._return(JExpr.ref("list"));
    	/*JForEach foreach = body.forEach($integerclass, "count", $list);
    	JVar $count1 = foreach.var();*/
    	//foreach.body().assign(JExpr.ref("getCount"), JExpr.lit(10));
    	jCodeModel.build(new File("src"));
	}

}
