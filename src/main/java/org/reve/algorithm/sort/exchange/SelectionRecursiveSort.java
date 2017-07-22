package org.reve.algorithm.sort.exchange;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SelectionRecursiveSort extends SelectionSort {
	private static Logger LOGGER = LoggerFactory.getLogger(SelectionRecursiveSort.class);

	public static int[] sort(int[] array, int baseIndex) {
		LOGGER.info("{}", array);

		int nextBaseIndex = baseIndex + 1;
		int lastBaseIndex = array.length - 2;
		int minIndex = findMinIndex(array, baseIndex, baseIndex + 1);
		if (baseIndex != minIndex) {
			array = swap(array, baseIndex, minIndex);
		}

		if (baseIndex >= lastBaseIndex) {
			return array;
		}

		return sort(array, nextBaseIndex);
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
