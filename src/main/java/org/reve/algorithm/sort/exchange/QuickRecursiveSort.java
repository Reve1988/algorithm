package org.reve.algorithm.sort.exchange;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QuickRecursiveSort extends ExchangeSort {
	private static final Logger LOGGER = LoggerFactory.getLogger(QuickRecursiveSort.class);

	public static int[] sort(int[] array) {
		if (array == null || array.length <= 1) {
			return array;
		}

		int leftIndex = 0;
		int rightIndex = array.length - 1;

		return sort(array, leftIndex, rightIndex);
	}

	private static int[] sort(int[] array, int leftIndex, int rightIndex) {
		if (leftIndex < rightIndex) {
			int pivotIndex = partitionQuickSort(array, leftIndex, rightIndex);
			sort(array, leftIndex, pivotIndex - 1);
			sort(array, pivotIndex + 1, rightIndex);
		}

		return array;
	}

	private static int partitionQuickSort(int[] array, int leftIndex, int rightIndex) {
		int pivotIndex = rightIndex;

		while (leftIndex < rightIndex) {
			leftIndex = moveLeftIndex(array, pivotIndex, leftIndex, rightIndex);
			rightIndex = moveRightIndex(array, pivotIndex, leftIndex, rightIndex);
			if (leftIndex < rightIndex) {
				swap(array, leftIndex, rightIndex);
			}
		}

		swap(array, leftIndex, pivotIndex);
		return leftIndex;
	}

	private static int moveLeftIndex(int[] array, int pivotIndex, int leftIndex, int rightIndex) {
		while (leftIndex < rightIndex && array[leftIndex] <= array[pivotIndex]) {
			leftIndex++;
		}

		return leftIndex;
	}

	private static int moveRightIndex(int[] array, int pivotIndex, int leftIndex, int rightIndex) {
		while (leftIndex < rightIndex && array[rightIndex] >= array[pivotIndex]) {
			rightIndex--;
		}

		return rightIndex;
	}
}
