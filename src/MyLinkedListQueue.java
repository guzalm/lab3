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
}
