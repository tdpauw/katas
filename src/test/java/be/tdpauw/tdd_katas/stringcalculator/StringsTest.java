package be.tdpauw.tdd_katas.stringcalculator;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import be.tdpauw.tdd_katas.utils.Strings;

public class StringsTest {

	@Test
	public void splitOfEmptyStringReturnsAnEmptyArray() {
		assertThat(Strings.split("")).hasSize(0);
	}

	@Test
	public void splitOnNewlineDelimiter() {
		assertThat(Strings.split("1\n2")).containsExactly("1","2");
	}

	@Test
	public void isEmptyOrNullReturnsTrueForNull() {
		assertThat(Strings.isEmptyOrNull(null)).isTrue();
	}

	@Test
	public void isEmptyOrNullReturnsTrueForEmptyString() {
		assertThat(Strings.isEmptyOrNull("")).isTrue();
	}
}
