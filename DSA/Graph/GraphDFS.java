import java.io.*;
import java.util.*;

class Graph {
    private int vertices;
    private LinkedList<Integer> adj[];

    // Constructor
    @SuppressWarnings("unchecked")
    Graph(int vertices) {
        this.vertices = vertices;
        adj = new LinkedList[vertices];
        for (int i = 0; i < vertices; ++i) {
            adj[i] = new LinkedList();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w); // Corrected indexing to v
    }

    void dfs(int vertex, boolean visited[]) {
        visited[vertex] = true;
        System.out.print(vertex + " "); // Print the visited vertex
        Iterator<Integer> i = adj[vertex].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n]) {
                dfs(n, visited); // Corrected to pass the adjacent vertex n
            }
        }
    }

    void DFS(int startVertex) {
        boolean visited[] = new boolean[vertices];
        dfs(startVertex, visited);
    }
}

public class GraphDFS {
    public static void main(String args[]) {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println(
                "Following is Depth First Traversal "
                        + "(starting from vertex 2)");

        // Function call
        g.DFS(2);
    }
}
