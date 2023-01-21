package com.stringtokenizer.userdefinedClasses;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test3 {

	public static void main(String[] args) {

		Pattern c = Pattern.compile("[0-9]");//only digits
		Matcher m = c.matcher("ab c$123#iJk^45 6*pQr @ wXYz");
		int count = 0;

		while (m.find()) {

			System.out.println(m.start() + " ====> " + m.end() + " ====> " + m.group());
			count++;
		}
		System.out.println("count=" + count);
	}

}
