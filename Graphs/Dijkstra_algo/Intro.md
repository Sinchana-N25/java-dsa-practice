## Dijkstra’s Algorithm

Dijkstra’s Algorithm is a shortest-path algorithm for weighted graphs (with **non-negative** edge weights).  
It finds the shortest distance from a start node to all other nodes by repeatedly visiting the closest unvisited node and updating paths.

---

### Algorithm Steps

1. **Initialization**
   - Assign a distance of `0` to the start node.
   - Assign a distance of `8` (infinity) to all other nodes.
   - Keep a table (or map) for:
     - **Cost** (shortest known distance from start)
     - **Parent** (previous node on the shortest path)
2. **Process nodes**

   - While there are unvisited nodes:
     1. Select the **unvisited node with the smallest cost**.
     2. For each neighbor of this node:
        - Calculate:  
          `new_cost = current_node_cost + edge_weight`
        - If `new_cost < recorded_cost[neighbor]`:
          - Update `recorded_cost[neighbor] = new_cost`
          - Update `parent[neighbor] = current_node`
     3. Mark the current node as **visited** (processed).

3. **Repeat** until all nodes are processed or shortest paths are found.
