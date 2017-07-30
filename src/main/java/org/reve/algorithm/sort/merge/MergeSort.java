package org.reve.algorithm.sort.merge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MergeSort {
	private static final Logger LOGGER = LoggerFactory.getLogger(MergeSort.class);

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

		int middleIndex = (startIndex + endIndex) / 2;
		mergeSort(array, resultArray, startIndex, middleIndex);
		mergeSort(array, resultArray, middleIndex + 1, endIndex);
		return merge(array, resultArray, startIndex, middleIndex, endIndex);
	}

	private static int[] merge(int[] array, int[] bufferArray, int startIndex, int middleIndex, int endIndex) {
		int partition1Index = startIndex;
		int partition2Index = middleIndex + 1;
		int bufferIndex = startIndex;

		while (partition1Index <= middleIndex && partition2Index <= endIndex) {
			if (array[partition1Index] < array[partition2Index]) {
				bufferArray[bufferIndex] = array[partition1Index];
				partition1Index++;
			} else {
				bufferArray[bufferIndex] = array[partition2Index];
				partition2Index++;
			}

			bufferIndex++;
		}

		while (partition1Index <= middleIndex) {
			bufferArray[bufferIndex++] = array[partition1Index++];
		}

		while (partition2Index <= endIndex) {
			bufferArray[bufferIndex++] = array[partition2Index++];
		}

		for (bufferIndex = startIndex; bufferIndex <= endIndex; bufferIndex++) {
			array[bufferIndex] = bufferArray[bufferIndex];
		}

		LOGGER.info("정렬범위 : {} ~ {} , 중간위치 : {}", startIndex, endIndex, middleIndex);
		LOGGER.info("{}", array);

		return array;
	}
}
