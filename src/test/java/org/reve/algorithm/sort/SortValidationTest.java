package org.reve.algorithm.sort;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.reve.algorithm.sort.exchange.*;
import org.slf4j.LoggerFactory;

import java.util.Random;

import static org.junit.Assert.assertTrue;

public class SortValidationTest {
	private static final Logger ROOT_LOGGER = (Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);

	private static final int TEST_ARRAY_SIZE = 1000;
	private static final Random RANDOM = new Random();

	private static int[] testArray = new int[TEST_ARRAY_SIZE];
	private static Level originalLogLevel;

	@BeforeClass
	public static void changeLogLevelToWarn() {
		originalLogLevel = ROOT_LOGGER.getLevel();
		ROOT_LOGGER.setLevel(Level.WARN);
	}

	@AfterClass
	public static void changeLogLevelToOriginal() {
		ROOT_LOGGER.setLevel(originalLogLevel);
	}

	@Before
	public void setUp() {
		for (int i = 0; i < TEST_ARRAY_SIZE; i++) {
			testArray[i] = RANDOM.nextInt();
		}
	}

	@Test
	public void testSelectionLoopSortValid() {
		// when
		testArray = SelectionLoopSort.sort(testArray);

		// then
		assertTrue(isSorted(testArray));
	}

	@Test
	public void testSelectionRecursiveSortValid() {
		// when
		testArray = SelectionRecursiveSort.sort(testArray);

		// then
		assertTrue(isSorted(testArray));
	}

	@Test
	public void testQuickLoopSortValid() {
		// when
		testArray = QuickLoopSort.sort(testArray);

		// then
		assertTrue(isSorted(testArray));
	}

	@Test
	public void testQuickRecursiveSortValid() {
		// when
		testArray = QuickRecursiveSort.sort(testArray);

		// then
		assertTrue(isSorted(testArray));
	}

	@Test
	public void testQuickRecursiveRandomPivotSortValid() {
		// when
		testArray = QuickRecursiveRandomPivotSort.sort(testArray);

		// then
		assertTrue(isSorted(testArray));
	}

	@Test
	public void testQuickRecursiveMedianPivotSortValid() {
		// when
		testArray = QuickRecursiveMedianPivotSort.sort(testArray);

		// then
		assertTrue(isSorted(testArray));
	}

	private boolean isSorted(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				return false;
			}
		}

		return true;
	}
}
