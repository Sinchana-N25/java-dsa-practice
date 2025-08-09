Undirected Graph(or Bidirectional Graph):

An undirected graph is a graph in which edges have no direction. The relationships between nodes are symmetric, meaning that if there is an edge connecting node A to node B, there is also an edge connecting node B to node A.

Key Characteristics:

-Symmetry: Edges do not have a specific direction, indicating a mutual relationship between connected nodes.
-Edge Uniqueness: There is typically only one edge between any pair of nodes, regardless of the order in which the nodes are listed.
-Example Scenario: Consider a social network where nodes represent individuals, and edges represent friendships. In an undirected graph, the friendship is mutual, and the graph captures the symmetric nature of friendships.
</br>

Directed Graph (Digraph/Unidirectional Graph):

A directed graph, or digraph, is a graph in which edges have a specific direction. Each edge points from one node to another, indicating a one-way relationship.

Key Characteristics:

-Directionality: Edges have a clear direction, representing an ordered pair of nodes, where the edge starts from one node and points to another.
-Asymmetry: Unlike undirected graphs, directed graphs can have edges in only one direction between nodes or have edges in both directions.
-Example Scenario: Consider a website where nodes represent web pages, and edges represent hyperlinks. In a directed graph, the hyperlinks direct traffic from one page to another, capturing the one-way flow of information on the internet.
</br>

Connected Graph:
A connected graph is a graph in which there exists a path between every pair of nodes. In other words, every node is reachable from every other node by following the edges of the graph.

Key Characteristics:

-Path Existence: A path exists between any two nodes in the graph.
-Single Connected Component: There is a single connected component, and no isolated nodes or subgraphs.
-Example Scenario: Imagine a transportation network where nodes represent cities, and edges represent roads. A connected graph ensures that there is a route between any two cities, facilitating seamless travel.
</br>

Disconnected Graph:
A disconnected graph is a graph in which there are at least two nodes without a path connecting them. It consists of two or more connected components, each of which is a connected subgraph.

Key Characteristics:

-Isolated Nodes: Nodes may exist without a path to reach other nodes in the graph.
-Multiple Connected Components: The graph is comprised of two or more connected subgraphs.
-Example Scenario: Consider a social network where nodes represent individuals, and edges represent friendships. A disconnected graph may indicate the presence of isolated groups of friends with no connections between them.
</br>

Weighted Graph:
A weighted graph is a graph in which each edge has an associated numerical value or weight. These weights can represent distances, costs, time, or any other relevant measure.

Key Characteristics:

-Edge Weights: Each edge is assigned a numerical value, indicating the significance or cost of the connection.
-Quantification of Relationships: Weights provide a quantitative measure of the relationship between connected nodes.
-Example Scenario: In a communication network where nodes represent routers and edges represent communication links, a weighted graph can represent the latency or bandwidth associated with each link, allowing for optimization of data transfer.
