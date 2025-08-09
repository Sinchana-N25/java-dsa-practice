Deque:

Introduction of Deque
A deque, short for "double-ended queue," is a data structure that allows elements to be added or removed from both ends. It's similar to a queue, but it supports operations at both the front and the back. Think of it as a combination of a stack and a queue.

There are four major operations that we perform in deque.

-push_front (add element to the front of deque)
-push_back (add element in the back of deque)
-pop_front (remove element from the front of the deque)
-pop_back (remove element from the back of the deque)

Library: java.util.ArrayDeque (part of the Java Collections Framework)

Implementation: In Java, the ArrayDeque class is commonly used for deque functionality. It is implemented as a resizable array, allowing for fast O(1) inserts and removes from both ends.
