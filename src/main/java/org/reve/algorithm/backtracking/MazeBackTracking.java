package org.reve.algorithm.backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MazeBackTracking {
	public static List<Position> find(Maze maze, Position start, Position end) {
		Stack<Position> path = new Stack<>();
		findPath(maze, path, start, end);

		return new ArrayList<>(path);
	}

	private static boolean findPath(Maze maze, Stack<Position> path, Position current, Position end) {
		maze.mark(current, Maze.VISITED);
		path.push(current);

		if (current.equals(end)) {
			return true;
		}

		for (Position next : getMovablePositionList(maze, current)) {
			boolean isFound = MazeBackTracking.findPath(maze, path, next, end);

			if (isFound) {
				return true;
			} else {
				path.pop();
			}
		}

		return false;
	}

	private static List<Position> getMovablePositionList(Maze maze, Position current) {
		List<Position> movablePositionList = new ArrayList<>();

		Position top = new Position(current.getX(), current.getY() - 1);
		if (maze.isMovablePosition(top)) {
			movablePositionList.add(top);
		}

		Position right = new Position(current.getX() + 1, current.getY());
		if (maze.isMovablePosition(right)) {
			movablePositionList.add(right);
		}

		Position bottom = new Position(current.getX(), current.getY() + 1);
		if (maze.isMovablePosition(bottom)) {
			movablePositionList.add(bottom);
		}

		Position left = new Position(current.getX() - 1, current.getY());
		if (maze.isMovablePosition(left)) {
			movablePositionList.add(left);
		}

		return movablePositionList;
	}
}
