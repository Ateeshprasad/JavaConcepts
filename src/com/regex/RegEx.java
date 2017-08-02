package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Regular Expressions are used for searching and manipulating strings

public class RegEx {

	public static void main(String[] args) {
		RegEx regEx=new RegEx();
		regEx.simplePatternMatch();
	}
	
	void simplePatternMatch() {
		Pattern pattern=Pattern.compile("((\\w*s))");
		Matcher match=pattern.matcher("is this is");
		
		
		System.out.println("is match found : "+match.matches());
		System.out.println("group count : "+match.groupCount());
		while(match.find()) {
			System.out.println("Found : "+match.group());
		}
	}

}
