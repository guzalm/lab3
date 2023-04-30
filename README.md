# lab3
STEP 1: First of all, I created a new public class named MyLinkedListStack for the MyLinkedList implementation. 

STEP 2: After, to continue work with Stack, I imported the necessary class: java.util.EmptyStackException for the stack exception.

STEP 3: now, I declared an instance variable "list" of type MyLinkedList inside the class, by using private MyLinkedList<T> list;.

STEP 4:There was created a constructor for the class and initialize the instance variable "list" inside MyLinkedListStack() by using "new" operator.
  
STEP 5:To implement the push method that adds an element to the top of the stack using the addFirst method for MyLinkedList in the MyLinkedListStack class, I added the code, by using the push() method takes an element of type T and adds it to the top of the stack using the addFirst() method of the list object.

STEP 6: Here I created new method pop(), which will removes and returns the top element of the stack using the removeFirst method for MyLinkedList.
  
STEP 7: Next step was creating if statement. Which means, if our stack does not have any elements, there will be exception as EmptyStackException() which will be thrown by program.

STEP 8: Then I add return statement, which will remove first(top) element from stack. It works if list is not empty.

STEP 9: I added the peek method that returns the top element of the stack without removing it using the getFirst method for MyLinkedList.
There is exception which works if stack is empty, If not, it calls getFirst() method.

STEP 10:  Here's the isEmpty() method implemented using the isEmpty() method of MyLinkedList to check if the stack is empty or not

STEP 11: I created the size() method simply calls the size() method of MyLinkedList and returns its result.

STEP 12: I just created new class MyLinkedListQueue<T> for the MyLinkedList implementation

STEP 13: There was imported the necessary classes: java.util.NoSuchElementException for the queue exceptions, and MyLinkedList

STEP 14: Declared an instance variable of type MyLinkedList inside the class. I used private variable "list".
  
STEP 15: Created a constructor for the class and initialize the instance variable "list" by using new.
  
STEP 16: I implemented the enqueue method that adds an element to the back of the queue using the addLast method for MyLinkedList.
  
STEP 17: I implemented the dequeue method that removes and returns the front element of the queue using the removeFirst method for MyLinkedList. I used emptystackexception to throw if list is empty, if not, it returns method removeFirst() from mylinkedlist class.  
  
STEP 18: Here is an implementation of the peek method that returns the front element of the queue without removing it using the getFirst method for MyLinkedList.  

STEP 19: Implement the isEmpty method that returns true if the queue is empty or false if it is not using the isEmpty method for MyLinkedList.
  
STEP 20: Then I implemented the size method that returns the number of elements in the queue using the size method for MyLinkedList.
  
STEP 21:The size() method is a common method found in many data structures, including linked lists. It is used to return the number of elements currently stored in the data structure.
In the case of the MyLinkedList class, the size() method simply returns the size instance variable, which keeps track of the number of elements currently stored in the linked list.

STEP 22: To my project I added Main class to check other 2 created classes. First of all, I want to start with MyLinkedListQueue, I declared new variable "queue".

STEP 23: In main I started checking methods of MyLinkedListQueue class. First one is "isEmpty" method. When we check is queue isEmpty, system prints "true" message, because we did not add anything to our queue.
  
STEP 24: To empty queue I added 1 element by enqueue method to check is other methods work as size, dequeue, peek.
  
STEP 25: After adding element to queue, I reasked the system is queue is empty or not by isEmpty method, and answer is "false", because queue has an element.
  
STEP 26: The size method also works, because after adding one element, it prints that size of queue is 1.
