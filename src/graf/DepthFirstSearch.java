package graf;

import java.util.Iterator;
import java.util.LinkedList;

public class DepthFirstSearch {

    //reperesent a directed graph using adjacency list with recursive
    int V;

    //array of lists for adjacency list represent
    LinkedList<Integer>[] adj;

    public DepthFirstSearch(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    //add an edge into the graph
    void addEdge(int v, int w){
        //add w to v list
        adj[v].add(w);
    }

    void dfs(int v, boolean[] visited){
        //mark the current node as visited and print it
        visited[v] = true;
        System.out.println(v);

        //recursive for all the vertices adjacency to this vertex
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()){
            int n = i.next();
            if (!visited[n])
                dfs(n, visited);
        }
    }

    //fun to do dfs traversal. it uses recursive dfs()
    void dfsTraversal(){
        boolean[] visited = new boolean[V];
        
        //call the recursive helper fun to print DFS traversal
        //starting from all vertices one by one
        for (int i = 0; i < V; i++) {
            if (!visited[i])
                dfs(i, visited);
        }
    }

    public static void main(String[] args) {
        DepthFirstSearch graf = new DepthFirstSearch(4);

        graf.addEdge(0,1);
        graf.addEdge(0,2);
        graf.addEdge(1,2);
        graf.addEdge(2,0);
        graf.addEdge(2,3);
        graf.addEdge(3,3);

        graf.dfsTraversal();
    }
}
