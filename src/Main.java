public class Main {
    public static void main(String[] args) {
        MyLinkedListQueue<Double> queue = new MyLinkedListQueue<>();
        //Start checking methods
        System.out.println(queue.isEmpty());//prints "true"
        //Adding elements to check other methods
        queue.enqueue(1.0);
        //Check the size after adding element
        System.out.println(queue.isEmpty());



    }
}
