public class Main {
    public static void main(String[] args) {
        MyLinkedListQueue<Double> queue = new MyLinkedListQueue<>();
        //Start checking methods
        System.out.println(queue.isEmpty());//prints "true"
        //Adding elements to check other methods
        queue.enqueue(1.0);

        //Check the size after adding element
        System.out.println(queue.isEmpty());//prints "false"
        System.out.println(queue.size());//prints 1;
        queue.enqueue(2.0);
        //Shows element in the top
        System.out.println(queue.peek());
        //Remove first element and check which will be on the top
        queue.dequeue(1);
        System.out.println(queue.peek());

        //Start checking stack
        System.out.println("Start checking STACK:");
        MyLinkedListStack<Double> stack = new MyLinkedListStack<>();
        System.out.println("Is STACK empty? " +stack.isEmpty());//prints true


    }
}
