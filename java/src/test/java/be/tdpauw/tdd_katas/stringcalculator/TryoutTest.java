package be.tdpauw.tdd_katas.stringcalculator;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

import org.junit.Test;

public class TryoutTest {

	@Test
	public void sumOfEmptyArray() {
		String[] numbers = new String[0];
		assertThat(Arrays.stream(numbers).mapToInt(Integer::valueOf).sum()).isEqualTo(0);
	}

	@Test
	public void splitOfEmptyStringReturnsAnArrayWithEmptyString() {
		assertThat("".split(",")).containsExactly("");
	}
}
