import java.util.LinkedList;
import java.util.Queue;

class Graph {
    int vertices;
    LinkedList<Integer>[] adList;

    @SuppressWarnings("unchecked")
    Graph(int vertices) {
        this.vertices = vertices;
        adList = new LinkedList[vertices];
        for (int i = 0; i < vertices; ++i) {
            adList[i] = new LinkedList<>();
        }
    }

    // fun to add an edge to the graph.
    void addEdge(int u, int v) {
        adList[u].add(v);
    }

    // Function to perform Breadth First Search on a graph represented using adjacency list.
    void bfs(int startNode) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[vertices];
        // Mark current node as visited.
        visited[startNode] = true;
        queue.add(startNode);

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            System.out.print(currentNode + " ");

            for (int neighbor : adList[currentNode]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }
}

public class GraphBFS {
    public static void main(String[] args) {
        int vertices = 5;
        Graph g = new Graph(vertices);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 4);

        System.out.println("Breadth First Traversal starting from vertex 0: ");
        g.bfs(0);
        System.out.println("Breadth First Traversal starting from vertex 1: "); // Corrected method call from GraphBFS to bfs
        g.bfs(1);
        System.out.println("Breadth First Traversal starting from vertex 2: "); // Corrected method call from GraphBFS to bfs
        g.bfs(2);
        System.out.println("Breadth First Traversal starting from vertex 3: "); // Corrected method call from GraphBFS to bfs
        g.bfs(3);
        System.out.println("Breadth First Traversal starting from vertex 4: "); // Corrected method call from GraphBFS to bfs
        g.bfs(4); // Corrected method call from GraphBFS to bfs
    }
}
