package org.reve.algorithm.backtracking;

public class Maze {
	public static final int PATH = 0;
	public static final int WALL = 1;
	public static final int VISITED = 2;

	private int[][] maze;

	public Maze(int[][] maze) {
		if (maze == null) {
			throw new IllegalArgumentException("Maze must not be null.");
		}

		if (maze.length <= 0) {
			throw new IllegalArgumentException("Maze must not be empty.");
		}

		if (maze[0].length <= 0) {
			throw new IllegalArgumentException("Maze must not be empty.");
		}

		this.maze = maze;
	}

	public boolean isOutOfMaze(Position position) {
		return position.getX() < 0
				|| position.getY() < 0
				|| position.getX() >= maze[0].length
				|| position.getY() >= maze.length;
	}

	public boolean isMovablePosition(Position position) {
		return !isOutOfMaze(position)
				&& getStatus(position) == PATH;
	}

	public int getStatus(Position position) {
		return maze[position.getX()][position.getY()];
	}

	public void mark(Position position, int marker) {
		maze[position.getX()][position.getY()] = marker;
	}
}
