package org.reve.algorithm.backtracking;

public class MazePathNotFoundException extends RuntimeException {
	private Maze maze;

	public MazePathNotFoundException(Maze maze) {
		this.maze = maze;
	}

	public Maze getMaze() {
		return maze;
	}
}
