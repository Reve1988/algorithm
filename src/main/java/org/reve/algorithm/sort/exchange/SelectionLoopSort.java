package org.reve.algorithm.sort.exchange;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SelectionLoopSort extends ExchangeSort {
	private final static Logger LOGGER = LoggerFactory.getLogger(SelectionLoopSort.class);

	public static int[] sort(int[] array) {
		if (array == null || array.length <= 1) {
			return array;
		}

		for (int baseIndex = 0; baseIndex < array.length - 1; baseIndex++) {
			LOGGER.info("{}", array);

			int minIndex = findMinIndex(array, baseIndex);
			if (minIndex != baseIndex) {
				array = swap(array, baseIndex, minIndex);
			}
		}

		return array;
	}

	private static int findMinIndex(int[] array, int baseIndex) {
		int minIndex = baseIndex;
		for (int compareIndex = baseIndex; compareIndex < array.length; compareIndex++) {
			if (array[compareIndex] < array[minIndex]) {
				minIndex = compareIndex;
			}
		}

		return minIndex;
	}
}
