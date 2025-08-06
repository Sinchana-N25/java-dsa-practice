Hash Table in Java is a HashMap

Hash tables are powerful data structures that allow for very fast data retrieval. They're widely used in many applications where quick access to data is crucial.

What is a hash table?

-A hash table stores key-value pairs
-It uses a hash function to compute an index into an array of buckets, from which the desired value can be found
-Provides very fast access to data, often with O(1) time complexity for insertions and lookups

HashMap is very efficient for storing and retrieving data when you have a unique key for each piece of data. It's particularly useful when you need to frequently look up values based on their keys

Time complexity of HashMap in Java:

-Insert: O(1) average case, O(n) worst case
-Delete: O(1) average case, O(n) worst case
-Search: O(1) average case, O(n) worst case
