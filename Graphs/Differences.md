| Feature                | BFS (for Graphs)                             | Dijkstra’s Algorithm                                   | Bellman–Ford Algorithm                                      |
|------------------------|----------------------------------------------|--------------------------------------------------------|--------------------------------------------------------------|
| **Purpose**            | Finds shortest path in **unweighted** graphs | Finds shortest path in **weighted (non-negative)** graphs | Finds shortest path in **weighted** graphs (handles negatives) |
| **Edge Weights**       | Assumes all edges have equal weight (1)       | Works only with **non-negative** edge weights          | Works with **negative** edge weights (no negative cycles)    |
| **Approach**           | Level-by-level traversal using a queue       | Greedy: pick smallest tentative distance each time     | Dynamic programming: relax all edges |V| - 1 times            |
| **Time Complexity**    | O(V + E)                                     | O((V + E) log V) with priority queue; O(V²) simple     | O(V × E)                                                    |
| **Use Case**           | Unweighted shortest paths, connectivity check| Fast shortest path for non-negative weights            | Graphs with negative weights, shortest path detection        |
| **Cycle Handling**     | Works fine with cycles                       | Works fine with cycles if weights are non-negative     | Detects **negative-weight cycles**                          |

