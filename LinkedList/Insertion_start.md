**Insertion at the beginning**

Now, suppose we have a linked list 1 -> 2 -> 3 and we want to insert 4 at the beginning. We can then follow these steps:

Create a new node with value 4. Let's call it newNode
Add the head of the existing linked list as the next of newNode.
Then set the head variable to the newNode, as the newNode is our new head.

Implementation
To implement insertion operation, we have to create a new class LinkedList and create a new method insertFront in it.
We have also added getHeadValue to get the value at head after insertion.
