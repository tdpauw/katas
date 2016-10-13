package be.tdpauw.tdd_katas.utils;

public class Strings {

	private Strings() {
		//do nothing
	}

	public static boolean isEmpty(String numbers) {
		return "".equals(numbers);
	}

	public static String[] split(String input) {
		if (input == null) {
			return new String[0];
		}

		if (isEmpty(input)) {
			return new String[0];
		}
		return input.split("[,|\n]");
	}
}
