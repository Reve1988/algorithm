package org.reve.algorithm.sort.exchange;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Stack;

public class QuickLoopSort extends ExchangeSort {
	private static final Logger LOGGER = LoggerFactory.getLogger(QuickLoopSort.class);

	public static int[] sort(int[] array) {
		if (array == null || array.length <= 1) {
			return array;
		}

		Stack<PartitionRange> partitionStack = new Stack<>();
		partitionStack.push(new PartitionRange(0, array.length - 1));

		while (!partitionStack.empty()) {
			PartitionRange partitionRange = partitionStack.pop();
			if (partitionRange.getStart() >= partitionRange.getEnd()) {
				continue;
			}

			int pivotIndex = partitionQuickSort(array, partitionRange.getStart(), partitionRange.getEnd());
			partitionStack.add(new PartitionRange(partitionRange.getStart(), pivotIndex - 1));
			partitionStack.add(new PartitionRange(pivotIndex + 1, partitionRange.getEnd()));
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

	private static class PartitionRange {
		private int start;
		private int end;

		public PartitionRange(int start, int end) {
			this.start = start;
			this.end = end;
		}

		public int getStart() {
			return start;
		}

		public int getEnd() {
			return end;
		}
	}
}