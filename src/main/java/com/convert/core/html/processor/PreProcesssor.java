package com.convert.core.html.processor;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.convert.core.Html;

public class PreProcesssor {
	
	public void generateProperties(){
		final Document doc = Html.getHtml();
		final Elements select = doc.select("label,button,h1,input[type=button]");
		for(Element e:select){
			System.out.println(e.tagName()+"."+e.text());
		}
		
	}
	public static void main(String[] args) {
		new PreProcesssor().generateProperties();
	}

}
