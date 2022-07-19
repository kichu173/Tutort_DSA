package tutort.graph.internalImpl;

public class AdjMatrixGraph {
    int vertices;
    int E;// no. of edges in Graph
    int[][] matrix;

    AdjMatrixGraph(int v) {
        this.vertices = v;
        matrix = new int[v][v];
    }

    public void addEdge(int source, int destination) {
        matrix[source][destination] = 1;
        matrix[destination][source] = 1;
        E++;// to calculate edges
    }

    public void printAdjMatrix() {
        System.out.println(vertices + " vertices, " + E + " edges " + "\n");
        for (int i = 0; i < vertices; i++) {// i => vertex
            System.out.println(i + ": ");
            for (int j = 0; j < vertices; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
}
