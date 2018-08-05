package org.reve.algorithm.ed;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class EditDistanceDynamicTest {
	@Test
	public void test1() {
		// given
		String base = "Sunday";
		String compare = "Saturday";

		// when
		int result = new EditDistanceDynamic().get(base, compare);

		// then
		assertThat(result, is(3));

		new EditDistanceDynamic().print(base, compare);
	}

	@Test
	public void test2() {
		// given
		String base = "abc";
		String compare = "ebd";

		// when
		int result = new EditDistanceDynamic().get(base, compare);

		// then
		assertThat(result, is(2));

		new EditDistanceDynamic().print(base, compare);
	}

	@Test
	public void test3() {
		// given
		String base = "money";
		String compare = "many";

		// when
		int result = new EditDistanceDynamic().get(base, compare);

		// then
		assertThat(result, is(2));

		new EditDistanceDynamic().print(base, compare);
	}

	@Test
	public void 성능테스트1_DnC() {
		// given
		String base = "MICROSOFT";
		String compare = "NCSOFT";

		// when
		int result = new EditDistance().get(base, compare);

		// then
		assertThat(result, is(4));

		new EditDistanceDynamic().print(base, compare);
	}

	@Test
	public void 성능테스트1_Dynamic() {
		// given
		String base = "MICROSOFT";
		String compare = "NCSOFT";

		// when
		int result = new EditDistanceDynamic().get(base, compare);

		// then
		assertThat(result, is(4));
	}

	@Ignore
	@Test
	public void 성능테스트2_DnC() {
		// given
		String base = "Pneumonoultramicroscopicsilicovolcanoconiosis";
		String compare = "Pseudopseudohypoparathyroidism";

		// when
		int result = new EditDistance().get(base, compare);

		// then
		assertThat(result, is(4));
	}

	@Test
	public void 성능테스트2_Dynamic() {
		// given
		String base = "Pneumonoultramicroscopicsilicovolcanoconiosis";
		String compare = "Pseudopseudohypoparathyroidism";

		// when
		int result = new EditDistanceDynamic().get(base, compare);

		// then
		assertThat(result, is(35));
	}
}