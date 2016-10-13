package be.tdpauw.tdd_katas.stringcalculator;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import be.tdpauw.tdd_katas.utils.Strings;

public class StringsTest {

	@Test
	public void splitOfEmptyStringReturnsAnEmptyArray() {
		assertThat(Strings.split("")).hasSize(0);
	}
}
