package be.tdpauw.tdd_katas.stringcalculator;

import static be.tdpauw.tdd_katas.utils.Strings.split;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import be.tdpauw.tdd_katas.utils.Strings;

public class StringCalculator {

	public int add(String input) {
		String[] numbers = split(input);

		List<Integer> negativeNumbers = Arrays.stream(numbers).mapToInt(Integer::parseInt).filter(x -> x < 0).boxed().collect(Collectors.toList());
		if (negativeNumbers.size() > 0) {
			throw new IllegalArgumentException();
		}

		int result = Arrays.stream(numbers).mapToInt(Integer::parseInt).sum();
		return result;
	}

}