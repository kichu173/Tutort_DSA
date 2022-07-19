package tutort.graph.internalImpl;

public class GraphRepresentation {

    public static void main(String[] args) {
        int[][] graph = {
                {0,1,0,0,1},
                {1,0,1,0,1},
                {0,1,0,1,0},
                {0,0,1,0,1},
                {1,1,0,1,0}
        };

        AdjMatrixGraph adjMatrixGraph = new AdjMatrixGraph(5);// no. of vertices is 5

        adjMatrixGraph.addEdge(0,1);
        adjMatrixGraph.addEdge(2,3);
        adjMatrixGraph.addEdge(1,2);
        adjMatrixGraph.addEdge(3,4);
        adjMatrixGraph.addEdge(0,4);
        adjMatrixGraph.addEdge(1,4);

        adjMatrixGraph.printAdjMatrix();

        System.out.println("--------------------------");

        Graph g = new Graph(5);// no. of vertices is 5

        g.addEdge(0,1);
        g.addEdge(2,3);
        g.addEdge(1,2);
        g.addEdge(3,4);
        g.addEdge(0,4);
        g.addEdge(1,4);

        g.printAdjList();

        g.bfs(0);
    }
}
