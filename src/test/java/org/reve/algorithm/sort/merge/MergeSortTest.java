package org.reve.algorithm.sort.merge;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MergeSortTest {
	private final static Logger LOGGER = LoggerFactory.getLogger(MergeSortTest.class);

	private int[] testArray;

	@Before
	public void setUp() {
		testArray = new int[]{80, 75, 10, 60, 15, 49, 12, 25};
	}

	@Test
	public void testMergeSort() {
		// given
		LOGGER.info("정렬 준비----------");
		LOGGER.info("{}", testArray);

		// when
		LOGGER.info("정렬 시작----------");
		long startTime = System.currentTimeMillis();
		int[] resultArray = MergeSort.sort(testArray);
		long endTime = System.currentTimeMillis();

		// then
		LOGGER.info("정렬 완료---------- {}ms", endTime - startTime);
		LOGGER.info("{}\n", resultArray);
	}
}
