package com.stringtokenizer.quantifier;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test4 {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("a{4}");// exactly 4 times a
		Matcher m = p.matcher("abaabaaabaaaabaaaaabaaaaaab");
		
		int c=0;
		while(m.find()) {
			
	     System.out.println(m.start()+" ====> "+m.end()+" ====> "+m.group());
	     c++;
		}
		
		
		

	}

}
