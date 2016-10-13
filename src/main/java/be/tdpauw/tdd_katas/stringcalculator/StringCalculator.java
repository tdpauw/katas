package be.tdpauw.tdd_katas.stringcalculator;

import java.util.Arrays;

import be.tdpauw.tdd_katas.utils.Strings;

public class StringCalculator {

	public int add(String input) {
		if (Strings.isEmpty(input)) {
			return 0;
		}

		String[] numbers = Strings.split(input);

		int result = Arrays.stream(numbers).mapToInt(Integer::parseInt).sum();
		return result;
	}

}