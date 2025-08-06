What is a HashSet?

-A HashSet is a collection that stores unique elements.
-It is backed by a hash table (similar to a HashMap but stores only keys).
-No duplicates allowed — if you try to insert a duplicate, it will be ignored.
-No guarantee of order (elements are stored based on hash code).
-Allows null (only one null element).
-Very fast: O(1) average time for add, remove, and contains.

When to use a HashSet

-When you only need to know if an element exists (membership check).
-When you want to eliminate duplicates.
-When order of elements does not matter.

Common in problems like:

-Detect duplicates in an array.
-Track visited elements in algorithms like DFS/BFS.
-Store unique items without caring about indexing.

Time Complexity:

-Insert (add): O(1) average, O(n) worst case.
-Delete (remove): O(1) average, O(n) worst case.
-Search (contains): O(1) average, O(n) worst case.

Worst case happens when all elements land in the same hash bucket (very rare with good hash functions).
