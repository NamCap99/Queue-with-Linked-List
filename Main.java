package Queue;

public class Main {
    public static void main(String[] args) {
        QueueWithLinkedList queue = new QueueWithLinkedList();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.printQueue();
        System.out.println("Peek: " + queue.peek());  // Output: Peek: 10
        System.out.println("Size: " + queue.size());  // Output: Size: 3
//
        queue.dequeue();  // Output: Dequeued: 10
        queue.printQueue();  // Custom method to print the queue if you implement it
//
        System.out.println("Size: " + queue.size() + "\nQueue is empty " + queue.isEmpty());  // Output: Size: 2
    }
}
