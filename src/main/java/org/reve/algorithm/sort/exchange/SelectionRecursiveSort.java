package org.reve.algorithm.sort.exchange;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SelectionRecursiveSort extends SelectionSort {
	private static Logger LOGGER = LoggerFactory.getLogger(SelectionRecursiveSort.class);

	public static int[] sort(int[] array) {
		if (array == null || array.length <= 1) {
			return array;
		}

		return sort(array, 0);
	}

	private static int[] sort(int[] array, int baseIndex) {
		LOGGER.info("{}", array);

		int minIndex = findMinIndex(array, baseIndex);
		if (minIndex != baseIndex) {
			array = swap(array, baseIndex, minIndex);
		}

		if (baseIndex >= array.length - 2) {
			return array;
		}

		return sort(array, baseIndex + 1);
	}

	private static int findMinIndex(int[] array, int baseIndex) {
		return findMinIndex(array, baseIndex, baseIndex + 1);
	}

	private static int findMinIndex(int[] array, int baseIndex, int compareIndex) {
		int minIndex = baseIndex;
		if (array[compareIndex] < array[baseIndex]) {
			minIndex = compareIndex;
		}

		if (compareIndex + 1 >= array.length) {
			return minIndex;
		}

		return findMinIndex(array, minIndex, compareIndex + 1);
	}
}
