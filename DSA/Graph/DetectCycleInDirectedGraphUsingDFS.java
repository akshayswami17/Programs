import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Graph 
{
    private final int vertices;
    private final List<List<Integer>> adj;

    public Graph(int vertices)
    {
        this.vertices = vertices;
        adj = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adj.add(new LinkedList<>());
        }
    }

    // Function to detect cycle using DFS
    private boolean isCyclicUtil(int i, boolean[] visited, boolean[] recStack)
    {
        if (recStack[i]) return true;
        if (visited[i]) return false;

        visited[i] = true;
        recStack[i] = true;

        List<Integer> children = adj.get(i);
        for (Integer c : children)
        {
            if (isCyclicUtil(c, visited, recStack)) return true;
        }

        recStack[i] = false;

        return false;
    }

    void addEdge(int source, int dest){
        adj.get(source).add(dest);
    }

    boolean isCyclic()
    {
        boolean[] visited = new boolean[vertices];
        boolean[] recStack = new boolean[vertices];

        for (int i = 0; i < vertices; i++)
        {
            if (isCyclicUtil(i, visited, recStack))
                return true;
        }
        return false;
    }

}

public class DetectCycleInDirectedGraphUsingDFS 
{
    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,3);

        if (g.isCyclic())
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't contain cycle");

    }

}
