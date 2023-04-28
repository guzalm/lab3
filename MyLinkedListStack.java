import java.util.EmptyStackException;
public class MyLinkedListStack<T> {
    //declaretion of instance variable "list"
    private MyLinkedList<T> list;
    //Initialize the instance variable "list"
    public MyLinkedListStack() {
        list = new MyLinkedList<>();
    }
    // Adds an element to the top of the stack

    public void push(T element) {
        list.addFirst(element);
    }
    // Removes and returns the top element of the stack
    public T pop() {


    }
}

