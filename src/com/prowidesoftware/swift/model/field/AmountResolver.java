package com.prowidesoftware.swift.model.field;

import java.math.BigDecimal;
import java.util.List;

import org.apache.commons.lang.StringUtils;

public class AmountResolver {

	public static List<BigDecimal> amounts(Field f, int ... component) {
		return null;
	}
	
	public static BigDecimal amount(Field f) {
		int i = StringUtils.indexOf(f.componentsPattern(), 'N');
		if (i>=0) {
			final Number n = (Number) f.getComponentAs(i+1, Number.class);
			return new BigDecimal(n.toString());
		}
		return null;
	}
}
