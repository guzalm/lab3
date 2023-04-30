public class Main {
    public static void main(String[] args) {
        MyLinkedListQueue<Double> queue = new MyLinkedListQueue<>();
        //Start checking methods
        System.out.println(queue.isEmpty());//prints "true"
        //Adding elements to check other methods
        queue.enqueue(1.0);
        queue.enqueue(2.0);
        queue.enqueue(3.0);

    }
}
