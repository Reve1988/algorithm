package org.reve.algorithm.ed;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class EditDistanceTest {
	@Test
	public void test1() {
		// given
		String base = "Sunday";
		String compare = "Saturday";

		// when
		int result = new EditDistance().get(base, compare);

		// then
		assertThat(result, is(3));
	}

	@Test
	public void test2() {
		// given
		String base = "abc";
		String compare = "ebd";

		// when
		int result = new EditDistance().get(base, compare);

		// then
		assertThat(result, is(2));
	}

	@Test
	public void test3() {
		// given
		String base = "money";
		String compare = "many";

		// when
		int result = new EditDistance().get(base, compare);

		// then
		assertThat(result, is(2));
	}
}