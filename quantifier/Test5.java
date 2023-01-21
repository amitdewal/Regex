package com.stringtokenizer.quantifier;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test5 {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("a{3,5}");// min-3 and max 5 times a's
		Matcher m = p.matcher("abaabaaabaaaabaaaaabaaaaaab");
		
		int c=0;
		while(m.find()) {
			
	     System.out.println(m.start()+" ====> "+m.end()+" ====> "+m.group());
	     c++;
		}
		
		
		

	}

}
