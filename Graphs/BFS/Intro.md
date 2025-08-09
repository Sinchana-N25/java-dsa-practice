Breadth-First Search (BFS) is a graph traversal algorithm that systematically explores a graph by visiting all the nodes at the current depth before moving on to nodes at the next depth. It starts from a source node and explores its neighbors first, before moving on to the next level of neighbors.

Algorithm Steps:

-Start from a source node.
-Enqueue the source node into a queue and mark it as visited.
-While the queue is not empty:
Dequeue a node from the queue and process it (print or do other operations).
Enqueue all unvisited neighbors of the dequeued node into the queue and mark them as visited.
-Repeat until the queue is empty.
