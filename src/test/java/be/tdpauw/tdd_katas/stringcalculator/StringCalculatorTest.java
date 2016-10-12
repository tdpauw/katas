package be.tdpauw.tdd_katas.stringcalculator;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class StringCalculatorTest {

	private final StringCalculator sut = new StringCalculator();

	@Test
	public void returnsZeroWhenPassingAnEmptyString() {
		assertThat(sut.add("")).isEqualTo(0);
	}

	@Test
	public void returnsOneWhenPassingAStringWithOne() {
		assertThat(sut.add("1")).isEqualTo(1);
	}

	@Test
	public void returnsTenWhenPassingAStringWithTen() {
		assertThat(sut.add("10")).isEqualTo(10);
	}

	@Test
	public void returnsMinusOneWhenPassingAStringWithMinusOne() {
		assertThat(sut.add("-1")).isEqualTo(-1);
	}

	@Test
	public void returnsThreeWhenPassingAstringWithOneAndTwo() {
		assertThat(sut.add("1,2")).isEqualTo(3);
	}

}
