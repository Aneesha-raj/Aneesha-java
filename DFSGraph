import java.util.*;

public class DFSGraph {
    private int vertices; 
    private LinkedList<Integer>[] adjList; 

    
    public DFSGraph(int v) {
        vertices = v;
        adjList = new LinkedList[v];

        for (int i = 0; i < v; ++i) {
            adjList[i] = new LinkedList<>();
        }
    }


    public void addEdge(int v, int w
