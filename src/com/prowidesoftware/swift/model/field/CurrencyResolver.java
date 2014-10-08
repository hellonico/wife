package com.prowidesoftware.swift.model.field;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class CurrencyResolver {

	public static List<String> resolveComponentsPattern(String pattern, List<String> components) {
		final List<String> result = new ArrayList<String>();
		if (pattern != null) {
			if (pattern.indexOf('C')>=0) {
				for (int i=0;i<pattern.length();i++) {
					if (pattern.charAt(i)=='C') {
						result.add(components.get(i));
					}
				}
			}
		}
		return result;
	}
	
	public static Currency resolveCurrency(CurrencyContainer o) {
		final String s = resolveCurrencyString(o);
		if (s==null)
			return null;
		return Currency.getInstance(s);
	}

	public static String resolveCurrencyString(CurrencyContainer o) {
		final List<String> list = o.currencyStrings();
		if (list.size()>0) {
			return list.get(0);
		}
		return null;
	}
	
	public static void resolveSetCurrency(final CurrencyContainer cc, final Currency cur) {
		
	}
	public static void resolveSetCurrency(final CurrencyContainer cc, final String cur) {
		final String pat = cc.componentsPattern();
		Field f = (Field)cc;
		for (int i=0;i<pat.length();i++) {
			if (pat.charAt(i)=='C') {
				f.setComponent(i, cur);
			}
		}
	}
}
