package be.tdpauw.tdd_katas.stringcalculator;

import static be.tdpauw.tdd_katas.utils.Strings.split;

import java.util.Arrays;

import be.tdpauw.tdd_katas.utils.Strings;

public class StringCalculator {

	public int add(String input) {
		if (input == null) {
			throw new IllegalArgumentException("numbers should not be null.");
		}

		String[] numbers = split(input);

		int result = Arrays.stream(numbers).mapToInt(Integer::parseInt).sum();
		return result;
	}

}