Analysis of BFS:

Each vertex takes O(1) time to visit and to explore all M edges we take O(M) total time.
So, the time complexity becomes O(1.N+M), O(N+M)
where N is the number of vertices in the graph.

Since the queue size will be equal to the number of vertices at maximum, the space complexity is O(N).
