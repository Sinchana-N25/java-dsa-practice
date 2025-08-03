**Insertion at k-th position**

The approach is similar to inserting at the end, but rather than going to the end of the list, we will just iterate to the k-th node.

To insert a node in between the k and k+1 node, we will have to change the next pointer of both the k-th node and new Node.

-Set next of new Node to next of current
-Set next of current to new Node
