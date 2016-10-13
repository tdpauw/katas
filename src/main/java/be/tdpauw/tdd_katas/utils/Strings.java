package be.tdpauw.tdd_katas.utils;

public class Strings {

	public static final String EMPTY = "";

	private Strings() {
		//do nothing
	}

	public static boolean isEmpty(String numbers) {
		return EMPTY.equals(numbers);
	}

	public static String[] split(String input) {
		if (isEmptyOrNull(input)) {
			return new String[0];
		}

		return input.split("[,|\n]");
	}

	public static boolean isEmptyOrNull(String input) {
		if (input == null) {
			return true;
		}

		if (isEmpty(input)) {
			return true;
		}
		return false;
	}
}
