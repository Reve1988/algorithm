package org.reve.algorithm.sort.exchange;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SelectionLoopSort extends SelectionSort {
	private static Logger LOGGER = LoggerFactory.getLogger(SelectionLoopSort.class);

	public static int[] sort(int[] array) {
		int minIndex;

		for (int baseIndex = 0; baseIndex < array.length - 1; baseIndex++) {
			LOGGER.info("{}", array);

			minIndex = baseIndex;
			for (int compareIndex = baseIndex + 1; compareIndex < array.length; compareIndex++) {
				if (array[compareIndex] < array[minIndex]) {
					minIndex = compareIndex;
				}
			}

			if (baseIndex != minIndex) {
				array = swap(array, baseIndex, minIndex);
			}
		}

		return array;
	}
}
