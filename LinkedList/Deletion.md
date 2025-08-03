**Delete from front**
Before deleting a node, we will need to find it by value. To find a value, we can traverse the linked list and see if node of any value matches the value we want to delete.

Once the targetNode is found, we can then delete it.

**Delete from any position**
Deletion from any position other than front is a little different.

For example, we have 1 -> 2 -> 3 and we want to remove 2.
For that, we have to point the next of 1 to 3 and delete 2.
