package be.tdpauw.tdd_katas.stringcalculator;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void returnsZeroWhenEmptyString() {
		assertThat(add("")).isEqualTo(0);
	}

	private int add(String numbers) {
		return 0;
	}
}
