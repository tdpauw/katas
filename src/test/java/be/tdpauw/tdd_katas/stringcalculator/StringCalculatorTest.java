package be.tdpauw.tdd_katas.stringcalculator;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void returnsZeroWhenEmptyString() {
		assertThat(add("")).isEqualTo(0);
	}

	@Test
	public void returnsOneWhenInputIsOne() {
		assertThat(add("1")).isEqualTo(1);
	}

	@Test
	public void returnsTenWhenPassingAStringOfTen() {
		assertThat(add("10")).isEqualTo(10);
	}

	private int add(String numbers) {
		if (isEmpty(numbers)) {
			return 0;
		}
		return Integer.valueOf(numbers);
	}

	private boolean isEmpty(String numbers) {
		return "".equals(numbers);
	}
}
