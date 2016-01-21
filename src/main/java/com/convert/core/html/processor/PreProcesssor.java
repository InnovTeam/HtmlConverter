package com.convert.core.html.processor;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.text.WordUtils;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.convert.core.Html;

public class PreProcesssor {
	
	public void generateProperties(){
		final Document doc = Html.getHtml();
		final Elements select = doc.select("label,button,input[type=button]");
		for(Element e:select){
		  System.out.println(StringUtils.capitalize(e.text()));
			//System.out.println(e.tagName()+"."+e.text());
		}
		
	}
	public static void main(String[] args) {
		new PreProcesssor().generateProperties();
	}

}
