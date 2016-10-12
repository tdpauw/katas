package be.tdpauw.tdd_katas.stringcalculator;

import be.tdpauw.tdd_katas.utils.Strings;

public class StringCalculator {

	public int add(String numbers) {
		if (Strings.isEmpty(numbers)) {
			return 0;
		}
		return Integer.valueOf(numbers);
	}
}