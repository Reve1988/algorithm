package org.reve.algorithm.graph.kruskal;

import org.reve.algorithm.graph.AdjacentListGraph;
import org.reve.algorithm.graph.WeightEdge;

import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class Kruskal {
	private AdjacentListGraph mininumSpanningTree;
	private Stack<WeightEdge> edges;

	public AdjacentListGraph extractMinimumSpanningTree(AdjacentListGraph graph) {
		// 1. 노드와 간선을 분리한다.
		extractNodesAndEdges(graph);

		while (!edges.empty()) {
			// 2. 가중치가 가장 작은 간선부터 꺼내온다.
			WeightEdge edge = edges.pop();

			// 3. 꺼내온 간선이 순환을 만드는지 확인한다.
			if (isCreateCycle(edge)) {
				continue;
			}

			// 4. 노드에 간선을 추가한다.
			mininumSpanningTree.addEdge(edge);
			mininumSpanningTree.printEdgeList();

			// 5. 그래프의 모든 노드가 연결되었는지 확인한다.
			if (isAllVertexConnected()) {
				return mininumSpanningTree;
			}
		}

		throw new CannotCreateMSTException();
	}

	private boolean isCreateCycle(WeightEdge edge) {
		return mininumSpanningTree.isConnected(edge.getVertex1(), edge.getVertex2());
	}

	private boolean isAllVertexConnected() {
		return mininumSpanningTree.getEdgeList().size() == (mininumSpanningTree.getNodeSize() - 1);
	}

	private void extractNodesAndEdges(AdjacentListGraph graph) {
		this.mininumSpanningTree = new AdjacentListGraph(graph.getNodeSize());
		this.edges = new Stack<>();

		List<WeightEdge> edgeList = graph.getEdgeList();
		edgeList.sort(Comparator.comparing(WeightEdge::getWeight, (v1, v2) -> v2 - v1));
		edgeList.forEach(edge -> edges.push(edge));
	}
}
