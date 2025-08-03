**Optimal insertion at the end**

The way we are doing insertion at the end is not really optimal. Every time we want to add an item at the end, we iterate through the complete list to reach the end.

The time complexity of insertion at end is thus O(N) where N is the size of the linked list. But we can make it O(1).

How?

By maintaining a tail pointer, which will point to the last element of the linked list. Thus whenever we want to insert at the end, we can use tail for that.
