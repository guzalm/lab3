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
