package src.graph;

import java.util.*;

public class LoopGraph {
    private int V;
    private LinkedList<Integer>[] adj;

    LoopGraph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList<>();
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    boolean isCyclic() {
        boolean[] visited = new boolean[V];
        boolean[] recStack = new boolean[V];

        for (int i = 0; i < V; i++)
            if (isCyclicUtil(i, visited, recStack))
                return true;

        return false;
    }

    boolean isCyclicUtil(int v, boolean[] visited, boolean[] recStack) {
        if (recStack[v])
            return true;
        if (visited[v])
            return false;

        visited[v] = true;
        recStack[v] = true;

        for (int next : adj[v]) {
            if (isCyclicUtil(next, visited, recStack))
                return true;
        }

        recStack[v] = false;

        return false;
    }

    public static void main(String[] args) {
        LoopGraph g = new LoopGraph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        if (g.isCyclic())
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't contain cycle");
    }
}
