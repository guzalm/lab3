import java.util.EmptyStackException;
public class MyLinkedListStack<T> {
    //declaration of instance variable "list"
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
    public T pop() throws EmptyStackException {
        if (list.isEmpty()) {
            throw new EmptyStackException();
        }
        return list.removeFirst();
    }
    // Returns the top element of the stack without removing it
    public T peek() throws EmptyStackException {
        if (list.isEmpty()) {
            throw new EmptyStackException();
        }
        return list.getFirst();
    }
    // Returns the number of elements in the stack
    public int size() {
        return list.size();
    }
    // Returns true if the stack is empty or false if it is not
    public boolean isEmpty() {
        return list.isEmpty();
    }
}

