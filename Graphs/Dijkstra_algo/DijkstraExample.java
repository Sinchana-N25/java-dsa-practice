import java.util.*;

// How it works:
// graph → adjacency list with weights.
// costs → shortest known distance from start to each node.
// parents → the path reconstruction table.
// processed → keeps track of visited nodes.
// findLowestCostNode → picks the smallest cost unvisited node.

public class DijkstraExample {
    public static void main(String[] args) {
        /*
         Graph layout:

              (6)
        start -----> a
          |          |
        (2)         (1)
          |          |
          v    (5)   v
          b -------> end
           \ 
           (3)
            \
             v
              a
        */

        // Graph represented as adjacency list with weights
        Map<String, Map<String, Integer>> graph = new HashMap<>();
        
        graph.put("start", Map.of("a", 6, "b", 2));
        graph.put("a", Map.of("end", 1));
        graph.put("b", Map.of("a", 3, "end", 5));
        graph.put("end", Map.of()); // No neighbors

        // Costs table
        Map<String, Integer> costs = new HashMap<>();
        costs.put("a", 6);
        costs.put("b", 2);
        costs.put("end", Integer.MAX_VALUE);

        // Parents table
        Map<String, String> parents = new HashMap<>();
        parents.put("a", "start");
        parents.put("b", "start");
        parents.put("end", null);

        // Processed set
        Set<String> processed = new HashSet<>();

        String node = findLowestCostNode(costs, processed);
        while (node != null) {
            int cost = costs.get(node);
            Map<String, Integer> neighbors = graph.get(node);

            for (String neighbor : neighbors.keySet()) {
                int newCost = cost + neighbors.get(neighbor);
                if (newCost < costs.getOrDefault(neighbor, Integer.MAX_VALUE)) {
                    costs.put(neighbor, newCost);
                    parents.put(neighbor, node);
                }
            }

            processed.add(node);
            node = findLowestCostNode(costs, processed);
        }

        System.out.println("Costs: " + costs);
        System.out.println("Parents: " + parents);
    }

    private static String findLowestCostNode(Map<String, Integer> costs, Set<String> processed) {
        String lowestNode = null;
        int lowestCost = Integer.MAX_VALUE;

        for (String node : costs.keySet()) {
            int cost = costs.get(node);
            if (cost < lowestCost && !processed.contains(node)) {
                lowestCost = cost;
                lowestNode = node;
            }
        }

        return lowestNode;
    }
}
