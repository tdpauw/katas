package be.tdpauw.tdd_katas.stringcalculator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import be.tdpauw.tdd_katas.utils.Strings;

public class StringCalculator {

	public int add(String input) {
		if (Strings.isEmpty(input)) {
			return 0;
		}

		String[] numbers = input.split(",");
		int result = 0;
		for(String number: numbers) {
			result += Integer.parseInt(number);
		}
		return result;
	}
}