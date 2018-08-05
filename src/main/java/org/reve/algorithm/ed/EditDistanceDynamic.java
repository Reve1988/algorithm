package org.reve.algorithm.ed;

public class EditDistanceDynamic {
	public int get(String base, String compare) {
		if (base == null || compare == null) {
			return -1;
		}

		int[][] dynamicTable = new int[base.length() + 1][compare.length() + 1];

		for (int i = 0; i < base.length() + 1; i++) {
			for (int j = 0; j < compare.length() + 1; j++) {
				if (i == 0) {
					dynamicTable[i][j] = j;
				} else if (j == 0) {
					dynamicTable[i][j] = i;
				} else if (base.charAt(i - 1) == compare.charAt(j - 1)) {
					dynamicTable[i][j] = dynamicTable[i - 1][j - 1];
				} else {
					dynamicTable[i][j] = 1 + min(
							dynamicTable[i - 1][j],
							dynamicTable[i][j - 1],
							dynamicTable[i - 1][j - 1]
					);
				}
			}
		}

		return dynamicTable[base.length()][compare.length()];
	}

	private int min(int a, int b, int c) {
		if (a < b && a < c) {
			return a;
		} else if (b < c) {
			return b;
		} else {
			return c;
		}
	}

	public void print(String base, String compare) {
		if (base == null || compare == null) {
			return;
		}

		int[][] dynamicTable = new int[base.length() + 1][compare.length() + 1];

		for (int i = 0; i < base.length() + 1; i++) {
			for (int j = 0; j < compare.length() + 1; j++) {
				if (i == 0) {
					dynamicTable[i][j] = j;
				} else if (j == 0) {
					dynamicTable[i][j] = i;
				} else if (base.charAt(i - 1) == compare.charAt(j - 1)) {
					dynamicTable[i][j] = dynamicTable[i - 1][j - 1];
				} else {
					dynamicTable[i][j] = 1 + min(
							dynamicTable[i - 1][j],
							dynamicTable[i][j - 1],
							dynamicTable[i - 1][j - 1]
					);
				}
			}
		}

		System.out.println("");
		System.out.println(String.format("Base : %s", base));
		System.out.println(String.format("Compare : %s", compare));

		for (int j = 0; j < compare.length() + 2; j++) {
			System.out.print("------");
		}
		System.out.println("");

		System.out.print("|    || {} |");
		for (int j = 0; j < compare.length(); j++) {
			System.out.print(String.format("|  %s |", compare.charAt(j)));
		}
		System.out.println("");

		for (int j = 0; j < compare.length() + 2; j++) {
			System.out.print("------");
		}
		System.out.println("");

		for (int i = 0; i < base.length() + 1; i++) {
			if (i == 0) {
				System.out.print("| {} |");
			} else {
				System.out.print(String.format("|  %s |", base.charAt(i - 1)));
			}

			for (int j = 0; j < compare.length() + 1; j++) {
				System.out.print(String.format("| %2d |", dynamicTable[i][j]));
			}
			System.out.println("");

			for (int j = 0; j < compare.length() + 2; j++) {
				System.out.print("------");
			}
			System.out.println("");
		}

		System.out.println("");
	}
}
