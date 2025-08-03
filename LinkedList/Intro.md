Linked list is a linear data structure where each element is a separate object connected to each other and is similar to Arrays.
In a LinkedList all the elements are connected to each other.

LinkedList is:
-Made of separate items linked together
-Good for adding or removing items anywhere in the list
-Not as good for accessing items by position

Starts with the Head pointer of the linked list and each node contains two fields:
-Value (Integer)
-Pointer to next node

The last node of a linked list is called Tail. The Tail's next pointer is NULL address indicating there is no element after it.

Primary Operations
-Insertion: Inserting an element at end/beginning or in the middle at some kth position.
-Deletion : Deleting an element from the list.
-Display : Traversing the whole linked list and output each element.

_Choose ArrayList when you need fast access to items, and LinkedList when you often add or remove items in the middle of the list._
