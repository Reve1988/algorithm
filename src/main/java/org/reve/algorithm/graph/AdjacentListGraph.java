package org.reve.algorithm.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AdjacentListGraph {
	private final List<List<WeightEdge>> adjacentList;
	private final List<WeightEdge> edgeList;

	public AdjacentListGraph(int vertexSize) {
		this.adjacentList = new ArrayList<>(vertexSize);
		for (int index = 0; index < vertexSize; index++) {
			adjacentList.add(new LinkedList<>());
		}

		this.edgeList = new LinkedList<>();
	}

	public int getNodeSize() {
		return adjacentList.size();
	}

	public void addEdge(int vertex1, int vertex2, int weight) {
		addEdge(new WeightEdge(vertex1, vertex2, weight));
	}

	public void addEdge(WeightEdge edge) {
		adjacentList.get(edge.getVertex1()).add(edge);
		adjacentList.get(edge.getVertex2()).add(edge);
		edgeList.add(edge);
	}

	public List<WeightEdge> getEdgeList() {
		return new ArrayList<>(edgeList);
	}

	public boolean isConnected(int vertex1, int vertex2) {
		// 도달 가능성 구하는 방법(플로이드 응용)을 이용한다.
		int[][] graphMetrix = createGraphMetrix();
		int metrixSize = graphMetrix.length;

		for (int i = 0; i < metrixSize; i++) {
			for (int j = 0; j < metrixSize; j++) {
				if (graphMetrix[i][j] > 0) {
					for (int k = 0; k < metrixSize; k++) {
						if (graphMetrix[i][k] > 0) {
							graphMetrix[j][k] = 1;
						}
					}
				}
			}
		}

		return graphMetrix[vertex1][vertex2] > 0;
	}

	private int[][] createGraphMetrix() {
		int[][] graphMetrix = createZeroInitializedMetrix(getNodeSize());
		for (WeightEdge edge : edgeList) {
			graphMetrix[edge.getVertex1()][edge.getVertex2()] = 1;
			graphMetrix[edge.getVertex2()][edge.getVertex1()] = 1;
		}

		return graphMetrix;
	}

	private int[][] createZeroInitializedMetrix(int size) {
		int[][] metrix = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				metrix[i][j] = 0;
			}
		}

		return metrix;
	}

	public void printEdgeList() {
		System.out.println("--------------------------------");
		for (WeightEdge edge : edgeList) {
			System.out.println(String.format("%d - %d (%d)", edge.getVertex1(), edge.getVertex2(), edge.getWeight()));
		}
		System.out.println("--------------------------------");
	}
}
