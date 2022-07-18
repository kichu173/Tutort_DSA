package tutort.graph.internalImpl;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    List<List<Integer>> adjList = new ArrayList<>();
    Graph(int v) {
        for (int i = 0; i < v; i++) {
            adjList.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    public void printAdjList() {
        for (int i = 0; i< adjList.size(); i++) {// i - vertex no.
            System.out.println("Adj List of vertex " + i);
            for (int j = 0; j < adjList.get(i).size(); j++) {
                System.out.println(" " + adjList.get(i).get(j));
            }
        }
    }
}
