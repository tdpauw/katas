package be.tdpauw.tdd_katas.stringcalculator;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class StringCalculatorTest {

	private final StringCalculator stringCalculator = new StringCalculator();

	@Test
	public void returnsZeroWhenPassingAnEmptyString() {
		assertThat(stringCalculator.add("")).isEqualTo(0);
	}

	@Test
	public void returnsOneWhenPassingAStringWithOne() {
		assertThat(stringCalculator.add("1")).isEqualTo(1);
	}

	@Test
	public void returnsTenWhenPassingAStringWithTen() {
		assertThat(stringCalculator.add("10")).isEqualTo(10);
	}

	@Test
	public void returnsMinusOneWhenPassingAStringWithMinusOne() {
		assertThat(stringCalculator.add("-1")).isEqualTo(-1);
	}

}
