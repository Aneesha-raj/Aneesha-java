import java.util.*;

public class BFSGraph {
    private int vertices; 
    private LinkedList<Integer>[] adjList; 

    
    public BFSGraph(int v) {
        vertices = v;
        adjList = new LinkedList[v];

        for (int i = 0; i < v; ++i) {
            adjList[i] = new LinkedList<>();
        }
    }

    
    public void addEdge(int v, int w) {
        adjList[v].add(w); 
        // adjList[w].add(v); 
    }

    // BFS traversal from a given source
    public void BFS(int start) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        
        visited[start] = true;
        queue.add(start);

        System.out.print("BFS Traversal starting from vertex " + start + ": ");

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            
            for (int neighbor : adjList[current]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        System.out.printl
