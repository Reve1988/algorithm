package org.reve.algorithm.sort.merge;

public class MergeSort {
	public static int[] sort(int[] array) {
		if (array == null || array.length <= 1) {
			return array;
		}

		int startIndex = 0;
		int endIndex = array.length - 1;
		int[] resultArray = new int[array.length];

		return mergeSort(array, resultArray, startIndex, endIndex);
	}

	private static int[] mergeSort(int[] array, int[] resultArray, int startIndex, int endIndex) {
		if (startIndex >= endIndex) {
			return array;
		}

		int middle = (startIndex + endIndex) / 2;
		mergeSort(array, resultArray, startIndex, middle);
		mergeSort(array, resultArray, middle + 1, endIndex);
		return merge(array, resultArray, startIndex, middle, endIndex);
	}

	private static int[] merge(int[] array, int[] resultArray, int startIndex, int middleIndex, int endIndex) {
		int partition1Index = startIndex;
		int partition2Index = middleIndex + 1;
		int resultIndex = startIndex;

		while (partition1Index <= middleIndex && partition2Index <= endIndex) {
			if (array[partition1Index] < array[partition2Index]) {
				resultArray[resultIndex] = array[partition1Index];
				partition1Index++;
			} else {
				resultArray[resultIndex] = array[partition2Index];
				partition2Index++;
			}

			resultIndex++;
		}

		while (partition1Index < middleIndex) {
			resultArray[resultIndex++] = array[partition1Index++];
		}

		while (partition2Index < endIndex) {
			resultArray[resultIndex++] = array[partition2Index++];
		}

		return resultArray;
	}
}
