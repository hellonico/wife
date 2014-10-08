package com.prowidesoftware.swift;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexHelper {

	static List<String> parse(String regex, String string) {
		Pattern pat = Pattern.compile(regex, Pattern.MULTILINE);
		Matcher matcher = pat.matcher(string);
		List<String> result = new ArrayList<String>();
		if (matcher.matches()) {
			int groups = matcher.groupCount();
			for (int i=1;i<=groups;i++) {
				result.add(matcher.group(i));
			}
		} else {
			System.err.println("Not matched");
		}
		return result;
	}
	
	// ptii pag 6
	String swiftToRegex(String swiftExpression) {
		/*
		  ‘:’4!c‘//’3!n    ==> :([A-Z]{4})//([0-9]{3})
		  
		  ‘:’4!c‘/’[8c] ‘/’4!c ==>  :([A-Z]{4})/([A-Z]{8})?/([0-9]{4})
		  
		 */
		return null;
	}
	public static void main(String[] args) {
		String regex1 = ":?([A-Z]*)/([A-Z]*)/([0-9]*)";
		
		List<String> o = parse(regex1, ":ABCD//123");
		System.out.println(o);
		
		/*
		 * Aca se puede ver como podemos definir el capturing group para 
		 * un componente opcional seteado en nul
		 */
		o = parse(regex1, ":ABCD//1231");
		System.out.println(o);

		o = parse(regex1, "ABCD//1231");
		System.out.println(o);

		o = parse(regex1, "://1231");
		System.out.println(o);

		o = parse(regex1, ":ABCD//");
		System.out.println(o);
		
		o = parse(regex1, ":ABCD//!");
		System.out.println(o);
	}
}
