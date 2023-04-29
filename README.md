# lab3
STEP 1: First of all, I created a new public class named MyLinkedListStack for the MyLinkedList implementation. 

STEP 2: After, to continue work with Stack, I imported the necessary class: java.util.EmptyStackException for the stack exception.

STEP 3: now, I declared an instance variable "list" of type MyLinkedList inside the class, by using private MyLinkedList<T> list;.

STEP 4:There was created a constructor for the class and initialize the instance variable "list" inside MyLinkedListStack() by using "new" operator.
  
STEP 5:To implement the push method that adds an element to the top of the stack using the addFirst method for MyLinkedList in the MyLinkedListStack class, I added the code, by using the push() method takes an element of type T and adds it to the top of the stack using the addFirst() method of the list object.

STEP 6: Here I created new method pop(), which will removes and returns the top element of the stack using the removeFirst method for MyLinkedList.
  
STEP 7: Next step was creating if statement. Which means, if our stack does not have any elements, there will be exception as EmptyStackException() which will be thrown by program.

STEP 8: Then I add return statement, which will remove first(top) element from stack. It works if list is not empty.
