package org.reve.algorithm.backtracking;

import java.util.Objects;

public class Position {
	private int x;
	private int y;

	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (object == null || getClass() != object.getClass()) {
			return false;
		}

		Position position = (Position)object;
		return x == position.getX()
				&& y == position.getY();
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}
}
