import java.util.EmptyStackException;
import java.util.NoSuchElementException;
public class MyLinkedListQueue<T> {
    // Declaration of instance variable "list"
    private MyLinkedList<T> list;
    // Initialize the instance variable "list"
    public MyLinkedListQueue() {
        list = new MyLinkedList<>();
    }
    // Adds an element to the back of the queue
    public void enqueue(T element) {
        list.addLast(element);
    }
    // Removes and returns the front element of the queue
    public T dequeue() throws EmptyStackException {
        if (list.isEmpty()) {
            throw new EmptyStackException();
        }
        return list.removeFirst();
    }
    // Returns the front element of the queue without removing it
    public T peek() throws EmptyStackException {
        if (list.isEmpty()) {
            throw new EmptyStackException();
        }
        return list.getFirst();
    }
    // Returns true if the queue is empty or false if it is not
    public boolean isEmpty() {
        return list.isEmpty();
    }
    // Returns the number of elements in the queue
    public int size() {
        return list.size();
    }
}
