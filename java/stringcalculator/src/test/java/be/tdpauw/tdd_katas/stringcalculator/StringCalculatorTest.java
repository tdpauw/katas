package be.tdpauw.tdd_katas.stringcalculator;

import static be.tdpauw.tdd_katas.utils.Strings.EMPTY;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import org.junit.Test;

import com.sun.javaws.exceptions.InvalidArgumentException;

public class StringCalculatorTest {

	private final StringCalculator sut = new StringCalculator();

	@Test
	public void returnsZeroForAnEmptyString() {
		assertThat(sut.add(EMPTY)).isEqualTo(0);
	}

	@Test
	public void returnsZeroForNullString() {
		assertThat(sut.add(null)).isEqualTo(0);
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
	public void throwsExceptionOnNegativeNumber() {
		assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> sut.add("-1"));
	}

	@Test
	public void throwsExceptionOnOneAndMinusOne() {
		assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> sut.add("1,-1"));
	}


	@Test
	public void throwsExceptionOnMinusOneTwoAndMinusThree() {
		assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> sut.add("-1,2,-3"));
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

	@Test
	public void returnsFifteenForOneTwoThreeFourAndFive() {
		assertThat(sut.add("1,2,3,4,5")).isEqualTo(15);
	}

	@Test
	public void supportsNewlineDelimiter() {
		assertThat(sut.add("1\n2")).isEqualTo(3);
	}

	@Test
	public void supportsBothDelimiters() {
		assertThat(sut.add("1\n2,3")).isEqualTo(6);
	}

	@Test
	public void throwsExceptionOnInvalidDelimiter() {
		assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> sut.add("1,\n"));
	}
}
