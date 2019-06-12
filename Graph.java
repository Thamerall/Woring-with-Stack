import java.util.LinkedList;

public class Graph {

    int V;
    LinkedList<Integer> adjList[];
    Graph(int V){
        this.V = V;
        adjList = new LinkedList[V];
        for (int i = 0 ; i < V; i++){
            adjList[i] = new LinkedList<>();
        }
        // method to add an edge
    }
    static void addEdge(Graph graph , int st , int des){
        graph.adjList[st].add(des);
        // because graph is undirected
        graph.adjList[des].add(st);
    }
    static void printGraph(Graph graph){
        for (int v = 0 ; v < graph.V; v++){
            System.out.println("Adjavency List of vertex" + v);
            System.out.print("head");
            for (Integer p: graph.adjList[v]){
                System.out.print(" -> "+p);
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        int V = 5;
        Graph graph = new Graph(V);
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 4);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);

        // print the adjacency list representation of
        // the above graph
        printGraph(graph);
    }
}
