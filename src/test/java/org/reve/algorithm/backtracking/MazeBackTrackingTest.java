package org.reve.algorithm.backtracking;

import static org.reve.algorithm.backtracking.Maze.*;

import java.util.List;

import org.junit.Test;

public class MazeBackTrackingTest {
	@Test
	public void find1() {
		// given
		Maze maze = new Maze(new char[][] {
				{PATH, PATH, WALL, WALL, WALL, WALL, WALL, WALL},
				{WALL, PATH, PATH, PATH, PATH, PATH, PATH, WALL},
				{WALL, WALL, WALL, PATH, WALL, WALL, WALL, WALL},
				{WALL, WALL, WALL, PATH, WALL, WALL, WALL, WALL},
				{WALL, PATH, PATH, PATH, PATH, PATH, PATH, WALL},
				{WALL, PATH, WALL, WALL, WALL, WALL, WALL, WALL},
				{WALL, PATH, PATH, PATH, PATH, PATH, PATH, PATH},
				{WALL, WALL, WALL, WALL, WALL, WALL, WALL, PATH},
		});
		Position start = new Position(0, 0);
		Position end = new Position(7, 7);

		// when
		List<Position> path = MazeBackTracking.find(maze, start, end);

		// then
		maze.printOrigin();
		printPath(path);
		maze.print(path);
		maze.print();
	}

	@Test
	public void find2() {
		// given
		Maze maze = new Maze(new char[][] {
				{PATH, PATH, WALL, WALL, PATH, WALL, WALL, WALL},
				{WALL, PATH, PATH, PATH, PATH, PATH, PATH, WALL},
				{WALL, WALL, WALL, PATH, WALL, WALL, PATH, WALL},
				{WALL, WALL, WALL, PATH, WALL, WALL, WALL, WALL},
				{WALL, PATH, PATH, PATH, PATH, PATH, PATH, PATH},
				{WALL, PATH, WALL, WALL, WALL, WALL, WALL, PATH},
				{WALL, PATH, PATH, PATH, PATH, PATH, WALL, PATH},
				{WALL, WALL, WALL, WALL, WALL, WALL, WALL, PATH},
		});
		Position start = new Position(0, 0);
		Position end = new Position(7, 7);

		// when
		List<Position> path = MazeBackTracking.find(maze, start, end);

		// then
		maze.printOrigin();
		printPath(path);
		maze.print(path);
		maze.print();
	}

	@Test
	public void find3() {
		// given
		Maze maze = new Maze(new char[][] {
				{PATH, PATH, WALL, WALL, PATH, WALL, WALL, WALL},
				{WALL, PATH, PATH, PATH, PATH, PATH, PATH, WALL},
				{WALL, WALL, WALL, PATH, WALL, WALL, PATH, WALL},
				{WALL, PATH, WALL, PATH, WALL, WALL, WALL, WALL},
				{WALL, PATH, PATH, PATH, PATH, PATH, PATH, PATH},
				{WALL, WALL, WALL, WALL, WALL, WALL, WALL, PATH},
				{WALL, PATH, PATH, PATH, PATH, PATH, PATH, PATH},
				{WALL, WALL, WALL, WALL, WALL, WALL, WALL, PATH},
		});
		Position start = new Position(0, 0);
		Position end = new Position(7, 7);

		// when
		List<Position> path = MazeBackTracking.find(maze, start, end);

		// then
		maze.printOrigin();
		printPath(path);
		maze.print(path);
		maze.print();
	}

	private void printPath(List<Position> path) {
		System.out.println("경로 -----------------------------------------------------");
		for (int i = 0; i < path.size(); i++) {
			System.out.print(path.get(i));

			if (i < path.size() - 1) {
				System.out.print(" >> ");
			} else {
				System.out.println();
			}
		}
		System.out.println("----------------------------------------------------------");
	}
}