import java.util.NoSuchElementException;

public class MyLinkedList<T> {
    private Node<T> head;
    private int size;

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    // Adds an element to the beginning of the list
    public void addFirst(T element) {
        Node<T> newNode = new Node<>(element);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Removes and returns the first element of the list
    public T removeFirst() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException();
        }
        T data = head.data;
        head = head.next;
        size--;
        return data;
    }

    // Returns the first element of the list
    public T getFirst() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException();
        }
        return head.data;
    }

    // Returns the size of the list
    public int size() {
        return size;
    }

    // Returns true if the list is empty, false otherwise
    public boolean isEmpty() {
        return head == null;
    }
    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);

        if (isEmpty()) {
            head = newNode;
        } else {
            Node<T> tail = head;
            while (tail.next != null) {
                tail = tail.next;
            }
            tail.next = newNode;
        }
        size++;
    }





}
