package Graphs;
import java.util.*;
public class GraphExample {
    public static void main(String[] args) {
        // Use a HashMap to represent the adjacency list
        Map<String, List<String>> graph = new HashMap<>();

        // Add edges to the graph
        addEdge(graph, "Bob", "Alice");
        addEdge(graph, "Bob", "Carol");
        addEdge(graph, "Alice", "David");
        addEdge(graph, "Carol", "David");

        // Print the graph
        System.out.println("The graph:");
        printGraph(graph);

        // Get and print Bob's friends
        System.out.println("\nBob's friends:");
        List<String> bobFriends = graph.getOrDefault("Bob", new ArrayList<>());
        for (String friend : bobFriends) {
            System.out.println(friend);
        }
    }

    // Adds an edge to the adjacency list (undirected)
    private static void addEdge(Map<String, List<String>> graph, String src, String dest) {
        graph.computeIfAbsent(src, _ -> new ArrayList<>()).add(dest);
        graph.computeIfAbsent(dest, _ -> new ArrayList<>()).add(src);
    }

    // Prints the adjacency list
    private static void printGraph(Map<String, List<String>> graph) {
        for (String vertex : graph.keySet()) {
            System.out.println(vertex + " -> " + graph.get(vertex));
        }
    }
}
