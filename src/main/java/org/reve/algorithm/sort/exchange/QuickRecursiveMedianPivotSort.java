package org.reve.algorithm.sort.exchange;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QuickRecursiveMedianPivotSort extends ExchangeSort {
	private static final Logger LOGGER = LoggerFactory.getLogger(QuickRecursiveMedianPivotSort.class);

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
			int partitionIndex = partitionQuickSort(array, leftIndex, rightIndex);
			sort(array, leftIndex, partitionIndex - 1);
			sort(array, partitionIndex + 1, rightIndex);
		}

		return array;
	}

	private static int partitionQuickSort(int[] array, int leftIndex, int rightIndex) {
		int pivot = findPivotByMedianOfThree(array, leftIndex, rightIndex);

		while (leftIndex < rightIndex) {
			leftIndex = moveLeftIndex(array, pivot, leftIndex, rightIndex);
			rightIndex = moveRightIndex(array, pivot, leftIndex, rightIndex);
			if (leftIndex < rightIndex) {
				swap(array, leftIndex, rightIndex);
			}
		}

		return leftIndex;
	}

	private static int findPivotByMedianOfThree(int[] array, int leftIndex, int rightIndex) {
		int centerIndex = (rightIndex + leftIndex) / 2;

		if (array[leftIndex] > array[centerIndex]) {
			swap(array, leftIndex, centerIndex);
		}

		if (array[leftIndex] > array[rightIndex]) {
			swap(array, leftIndex, rightIndex);
		}

		if (array[centerIndex] > array[rightIndex]) {
			swap(array, centerIndex, rightIndex);
		}

		return array[centerIndex];
	}

	private static int moveLeftIndex(int[] array, int pivot, int leftIndex, int rightIndex) {
		while (leftIndex < rightIndex && array[leftIndex] < pivot) {
			leftIndex++;
		}

		return leftIndex;
	}

	private static int moveRightIndex(int[] array, int pivot, int leftIndex, int rightIndex) {
		while (leftIndex < rightIndex && array[rightIndex] > pivot) {
			rightIndex--;
		}

		return rightIndex;
	}
}
