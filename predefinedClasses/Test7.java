package com.stringtokenizer.predefinedClasses;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test7 {

	public static void main(String[] args) {

		Pattern c = Pattern.compile("\\W");// this is for except word character==>symbol and space
		Matcher m = c.matcher("ab c$123#iJk^45 6*pQr @ wXYz");// targer

		int count = 0;

		while (m.find()) {
			System.out.println(m.start() + "::  " + m.end() + "::  " + m.group());
			count++;

		}
		System.out.println("count::" + count);

	}

}
