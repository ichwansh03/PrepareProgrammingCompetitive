package graf;

import java.util.Iterator;
import java.util.LinkedList;

public class BreadthFirstSearch {

    int V;
    LinkedList[] adj;

    BreadthFirstSearch(int v){
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w){
        adj[v].add(w);
    }

    void bfs(int s){
        //mark all the vertices as not visited
        //by default set as false
        boolean[] visited = new boolean[V];

        //create queue for BFS
        LinkedList<Integer> queue = new LinkedList<>();

        //mark the current node as visited and enqueue it
        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0){
            //dequeue a vertex from queue and print it
            s = queue.poll();
            System.out.println(s);

            //get all adjacent vertices of the dequeued vertex
            //s if a adjacent has not been visited, then mark it visited and enqueue it
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()){
                int n = i.next();
                if (!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String[] args) {
        BreadthFirstSearch bfs = new BreadthFirstSearch(4);

        bfs.addEdge(0,1);
        bfs.addEdge(0,2);
        bfs.addEdge(1,2);
        bfs.addEdge(2,0);
        bfs.addEdge(2,3);
        bfs.addEdge(3,3);

        bfs.bfs(2);
    }
}
