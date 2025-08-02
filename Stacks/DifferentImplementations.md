Different ways of implementing stacks
In many languages, there are multiple methods you can use to implement stacks.

1.Using an Array:
Implementing a stack using an array is straightforward.
You define an array to hold the elements and a variable to keep track of the top of the stack.
The primary advantage of this method is that it's memory-efficient since you allocate memory only for the elements you need.
However, the downside is that the stack size is fixed and can't easily be resized without creating a new array.

2.sing a Linked List:
You can also use a singly linked list to implement a stack.
In this approach, you treat the head of the linked list as the top of the stack.
Linked lists offer dynamic sizing and are more memory-efficient than arrays when the stack size changes frequently.
However, linked lists have more overhead due to the pointers.

3.Using inbuilt libraries:
The Standard Template Library in C++, or inbuilt libraries of Python provides multiple in-built classes including stack. The implementation details are hidden from you and methods like push, top, pop, etc., are available for the functionality. We will learn more about this in later sections.
