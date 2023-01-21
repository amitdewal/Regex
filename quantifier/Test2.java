package com.stringtokenizer.quantifier;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("a*");// zero or more  a's and spaces
		Matcher m = p.matcher("abaabaaabaaaabaaaaabaaaaaab");
		
		int c=0;
		while(m.find()) {
			
	     System.out.println(m.start()+" ====> "+m.end()+" ====> "+m.group());
	     c++;
		}
		
		
		

	}

}
