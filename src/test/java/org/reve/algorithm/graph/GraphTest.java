package org.reve.algorithm.graph;

import org.junit.Test;
import org.reve.algorithm.graph.kruskal.Kruskal;

public class GraphTest {
	@Test
	public void test() {
		AdjacentListGraph graph = new AdjacentListGraph(6);
		graph.addEdge(0, 1, 4);
		graph.addEdge(0, 2, 3);
		graph.addEdge(1, 2, 2);
		graph.addEdge(2, 3, 1);
		graph.addEdge(3, 4, 1);
		graph.addEdge(3, 5, 5);
		graph.addEdge(4, 5, 6);

		System.out.println("초기그래프");
		graph.printEdgeList();

		System.out.println("크루스칼 알고리즘 시작");
		Kruskal kruskal = new Kruskal();
		AdjacentListGraph mst = kruskal.extractMinimumSpanningTree(graph);

		System.out.println("MST 결과");
		mst.printEdgeList();
	}
}
