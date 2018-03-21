package org.reve.algorithm.backtracking;

import java.util.List;

public class Maze {
	public static final char PATH = ' ';
	public static final char WALL = '*';
	public static final char VISITED = '0';

	private char[][] origin;
	private char[][] maze;

	public Maze(char[][] maze) {
		if (maze == null) {
			throw new IllegalArgumentException("Maze must not be null.");
		}

		if (maze.length <= 0) {
			throw new IllegalArgumentException("Maze must not be empty.");
		}

		if (maze[0].length <= 0) {
			throw new IllegalArgumentException("Maze must not be empty.");
		}

		this.origin = copy(maze);
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

	public char getStatus(Position position) {
		return maze[position.getX()][position.getY()];
	}

	public void mark(Position position, char marker) {
		maze[position.getX()][position.getY()] = marker;
	}

	public void print() {
		System.out.println("방문 이력 -------------------------------------------------");
		for (char[] list : maze) {
			for (char val : list) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
		System.out.println("----------------------------------------------------------");
	}

	public void printOrigin() {
		System.out.println("미로 원본 -------------------------------------------------");
		for (char[] list : origin) {
			for (char val : list) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
		System.out.println("----------------------------------------------------------");
	}

	public void print(List<Position> path) {
		char[][] temp = copy(origin);
		for (Position position : path) {
			temp[position.getX()][position.getY()] = VISITED;
		}

		System.out.println("방문 결과 -------------------------------------------------");
		for (char[] list : temp) {
			for (char val : list) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
		System.out.println("----------------------------------------------------------");
	}

	private char[][] copy(char[][] arr) {
		char[][] temp = new char[arr.length][arr[0].length];

		for (int i = 0; i < temp.length; i++) {
			temp[i] = arr[i].clone();
		}

		return temp;
	}
}
