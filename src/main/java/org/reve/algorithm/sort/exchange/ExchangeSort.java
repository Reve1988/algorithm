package org.reve.algorithm.sort.exchange;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class ExchangeSort {
	private static final Logger LOGGER = LoggerFactory.getLogger(QuickSort.class);

	static int[] swap(int[] array, int indexA, int indexB) {
		int indexAValue = array[indexA];
		array[indexA] = array[indexB];
		array[indexB] = indexAValue;
		LOGGER.info("{}", array);

		return array;
	}
}
