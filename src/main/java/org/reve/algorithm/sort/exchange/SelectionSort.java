package org.reve.algorithm.sort.exchange;

public abstract class SelectionSort {
	static int[] swap(int[] array, int indexA, int indexB) {
		int indexAValue = array[indexA];
		array[indexA] = array[indexB];
		array[indexB] = indexAValue;

		return array;
	}
}
