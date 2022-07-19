package tutort.graph.internalImpl;

import java.util.*;

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
    //breadth first search
    public void bfs(int v) {
        int V = adjList.size(); // total no. of Vertices
        boolean[] visited = new boolean[V];

        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        visited[v] = true;

        while(!q.isEmpty()) {
            //dequeue
            int vertex = q.remove();
            System.out.print(vertex + " ");
            for (int i = 0; i < adjList.get(vertex).size(); i++) {
                int adjacentVertex = adjList.get(vertex).get(i);
                if(!visited[adjacentVertex]) {
                    q.add(adjacentVertex);
                    visited[adjacentVertex] = true;
                }
            }
        }
    }
}
