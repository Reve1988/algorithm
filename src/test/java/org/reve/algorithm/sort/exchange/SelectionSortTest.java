package org.reve.algorithm.sort.exchange;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SelectionSortTest {
	private final static Logger LOGGER = LoggerFactory.getLogger(SelectionSortTest.class);
	private int[] testArray;

	@Before
	public void setUp() {
		testArray = new int[]{55, 153, 4, 63, 75, 23, 53, 66, 22, 10};
	}

	@Test
	public void testLoopSort() {
		// given
		LOGGER.info("정렬 준비----------");
		LOGGER.info("{}", testArray);

		// when
		LOGGER.info("정렬 시작----------");
		long startTime = System.currentTimeMillis();
		SelectionLoopSort.sort(testArray);
		long endTime = System.currentTimeMillis();

		// then
		LOGGER.info("정렬 완료---------- {}ms", endTime - startTime);
		LOGGER.info("{}\n", testArray);
	}

	@Test
	public void testRecursiveSort() {
		// given
		LOGGER.info("정렬 준비----------");
		LOGGER.info("{}", testArray);

		// when
		LOGGER.info("정렬 시작----------");
		long startTime = System.currentTimeMillis();
		SelectionRecursiveSort.sort(testArray);
		long endTime = System.currentTimeMillis();

		// then
		LOGGER.info("정렬 완료---------- {}ms", endTime - startTime);
		LOGGER.info("{}\n", testArray);
	}
}
