package be.tdpauw.tdd_katas.stringcalculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import org.junit.Test;

public class StringCalculatorTest {

	private final StringCalculator sut = new StringCalculator();

	@Test
	public void throwsExceptionOnNullInput() {
		assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> sut.add(null));
	}

	@Test
	public void returnsZeroForAnEmptyString() {
		assertThat(sut.add("")).isEqualTo(0);
	}

	@Test
	public void returnsOneForOne() {
		assertThat(sut.add("1")).isEqualTo(1);
	}

	@Test
	public void returnsTenForTen() {
		assertThat(sut.add("10")).isEqualTo(10);
	}

	@Test
	public void returnsMinusOneForMinusOne() {
		assertThat(sut.add("-1")).isEqualTo(-1);
	}

	@Test
	public void returnsThreeForOneAndTwo() {
		assertThat(sut.add("1,2")).isEqualTo(3);
	}

	@Test
	public void returnsSixForOneTwoAndThree() {
		assertThat(sut.add("1,2,3")).isEqualTo(6);
	}

	@Test
	public void returnsTenForOneTwoThreeAndFour() {
		assertThat(sut.add("1,2,3,4")).isEqualTo(10);
	}
}
