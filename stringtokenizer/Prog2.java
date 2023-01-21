package com.stringtokenizer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prog2 {

	public static void main(String[] args) 	{
	
	     Pattern c = Pattern.compile("[0-9]");//re
	     Matcher m = c.matcher("a1b2c9d57u");//target
	     
	     
	     int count=0;
	     while(m.find()) 
	     {
	    	 System.out.println(m.start()+"::  "+m.end()+"::  "+m.group());
	    	 
	    	 count++;
	     }
	     System.out.println("count::"+count);
	}

}
