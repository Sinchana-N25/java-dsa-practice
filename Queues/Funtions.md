Functions:

-Enqueue(int item) Function:
Adds an element to the rear of the queue.
If the queue is full, it prints an error message and does not enqueue the element.
Otherwise, it circularly increments the rear index, assigns the item to the updated rear index, and increments currentSize.

-Dequeue() Function:
Removes an element from the front of the circular queue.
If the queue is empty, it prints an error message and returns a sentinel value (-1 in this case, which can be considered as an error value).
Otherwise, it retrieves the item at the front index, circularly increments the front index, decrements currentSize, and returns the removed item.

-isEmpty function
Checks if the queue is empty.
Returns true if the currentSize (number of elements in the queue) is 0; otherwise, returns false.

-isFull() Function:
Checks if the queue is full.
Returns true if the currentSize is equal to the maximum size (maxSize); otherwise, returns false.

-size() Function:
Returns the current number of elements in the queue (currentSize).

## Java provides the java.util.Queue interface

Implementation in java:

import java.util.LinkedList;
import java.util.Queue;

Queue<Integer> myQueue = new LinkedList<>();
myQueue.add(1);
myQueue.add(2);
int item = myQueue.poll();
