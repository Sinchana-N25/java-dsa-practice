import java.util.*;

// How it works:
// Bellman–Ford is used to find the shortest paths from a source to all other vertices.
// Unlike Dijkstra, it works with graphs that have negative edge weights (but no negative cycles).
// It relaxes all edges |V| - 1 times, where V is the number of vertices.

public class BellmanFordExample {
    static class Edge {
        String src, dest;
        int weight;

        Edge(String src, String dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        /*
         Graph layout:

              (4)
        A --------> B
        |           |
      (5)|         (-2)
        v           v
        C <-------- D
         \   (3)
          \--------> B
        */

        // Create graph edges
        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge("A", "B", 4));
        edges.add(new Edge("A", "C", 5));
        edges.add(new Edge("C", "B", 3));
        edges.add(new Edge("B", "D", -2));
        edges.add(new Edge("D", "C", 1));

        // Vertices
        Set<String> verticesSet = new HashSet<>();
        for (Edge e : edges) {
            verticesSet.add(e.src);
            verticesSet.add(e.dest);
        }
        List<String> vertices = new ArrayList<>(verticesSet);

        // Initialize distances
        Map<String, Integer> dist = new HashMap<>();
        for (String v : vertices) {
            dist.put(v, Integer.MAX_VALUE);
        }
        String source = "A";
        dist.put(source, 0);

        // Relax edges |V| - 1 times
        for (int i = 0; i < vertices.size() - 1; i++) {
            for (Edge edge : edges) {
                if (dist.get(edge.src) != Integer.MAX_VALUE &&
                    dist.get(edge.src) + edge.weight < dist.get(edge.dest)) {
                    dist.put(edge.dest, dist.get(edge.src) + edge.weight);
                }
            }
        }

        // Check for negative-weight cycles
        for (Edge edge : edges) {
            if (dist.get(edge.src) != Integer.MAX_VALUE &&
                dist.get(edge.src) + edge.weight < dist.get(edge.dest)) {
                System.out.println("Graph contains a negative-weight cycle!");
                return;
            }
        }

        // Output shortest distances
        System.out.println("Shortest distances from source " + source + ":");
        for (String v : vertices) {
            System.out.println(v + " : " + (dist.get(v) == Integer.MAX_VALUE ? "INF" : dist.get(v)));
        }
    }
}

