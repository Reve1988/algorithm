package org.reve.algorithm.ed;

public class EditDistance {
	public int get(String base, String compare) {
		return recursive(base.toCharArray(), compare.toCharArray(), base.length(), compare.length());
	}

	private int recursive(char[] base, char[] compare, int baseIndex, int compareIndex) {
		if (baseIndex == 0) {
			return compareIndex;
		}

		if (compareIndex == 0) {
			return baseIndex;
		}

		if (base[baseIndex - 1] == compare[compareIndex - 1]) {
			return recursive(base, compare, baseIndex - 1, compareIndex - 1);
		}

		return 1 + min(
				recursive(base, compare, baseIndex, compareIndex - 1),
				recursive(base, compare, baseIndex - 1, compareIndex),
				recursive(base, compare, baseIndex - 1, compareIndex - 1)
		);
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
}
