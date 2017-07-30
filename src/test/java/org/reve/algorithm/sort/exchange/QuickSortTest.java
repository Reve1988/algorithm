package org.reve.algorithm.sort.exchange;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QuickSortTest {
	private final static Logger LOGGER = LoggerFactory.getLogger(QuickSortTest.class);

	private int[] testArray;

	@Before
	public void setUp() {
		testArray = new int[]{55, 153, 4, 63, 75, 23, 53, 66, 22, 10, 11};
	}

	@Test
	public void testQuickLoopSort() {
		// given
		LOGGER.info("정렬 준비----------");
		LOGGER.info("{}", testArray);

		// when
		LOGGER.info("정렬 시작----------");
		long startTime = System.currentTimeMillis();
		QuickLoopSort.sort(testArray);
		long endTime = System.currentTimeMillis();

		// then
		LOGGER.info("정렬 완료---------- {}ms", endTime - startTime);
		LOGGER.info("{}\n", testArray);
	}

	@Test
	public void testQuickRecursiveSort() {
		// given
		LOGGER.info("정렬 준비----------");
		LOGGER.info("{}", testArray);

		// when
		LOGGER.info("정렬 시작----------");
		long startTime = System.currentTimeMillis();
		QuickRecursiveSort.sort(testArray);
		long endTime = System.currentTimeMillis();

		// then
		LOGGER.info("정렬 완료---------- {}ms", endTime - startTime);
		LOGGER.info("{}\n", testArray);
	}

	@Test
	public void testQuickRecursiveRandomPivotSort() {
		// given
		LOGGER.info("정렬 준비----------");
		LOGGER.info("{}", testArray);

		// when
		LOGGER.info("정렬 시작----------");
		long startTime = System.currentTimeMillis();
		QuickRecursiveRandomPivotSort.sort(testArray);
		long endTime = System.currentTimeMillis();

		// then
		LOGGER.info("정렬 완료---------- {}ms", endTime - startTime);
		LOGGER.info("{}\n", testArray);
	}

	@Test
	public void testQuickRecursiveMedianPivotSort() {
		// given
		LOGGER.info("정렬 준비----------");
		LOGGER.info("{}", testArray);

		// when
		LOGGER.info("정렬 시작----------");
		long startTime = System.currentTimeMillis();
		QuickRecursiveMedianPivotSort.sort(testArray);
		long endTime = System.currentTimeMillis();

		// then
		LOGGER.info("정렬 완료---------- {}ms", endTime - startTime);
		LOGGER.info("{}\n", testArray);
	}
}
