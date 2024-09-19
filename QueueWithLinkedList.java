package Queue;

public class QueueWithLinkedList {
    private Node front, rear; // front points to the front of the queue
                            // rear points to the rear of the queue

    QueueWithLinkedList(){
        this.front = null;
        this.rear = null;
    }

//    Add an element to the end of the queue
    public void enqueue(int data){
        Node newNode = new Node(data); // create the new Node with data = value
        newNode.next = null;
        //if rear is null --> queue is empty
        if(rear == null){
            front = rear = newNode;
        }else{
            rear.next = newNode;
            rear = newNode;
        }
    }

//    Dequeue(): remove an element from the front of the queue
    public int dequeue(){
        if(isEmpty()){
            return -1;
        }
        int value = front.data;
        front = front.next;

//        queue becomes empty after dequeue
        if(front == null){
            rear = null;
        }

        return value;
    }
    //    Peek(): Get the element at the front of the queue without removing it
    public int peek(){
        if(isEmpty()){
            return -1;
        }else{
            return front.data;
        }
    }

//    isEmpty(): check if the queue is empty
    public boolean isEmpty(){
        if(front == null){
            System.out.println("Queue is empty");
            return true;
        }
        return false;
    }
//    Size(): return the number of elements in the queue
    public int size(){
        if(isEmpty()){
            return 0;
        }
        int size = 0;
        Node current = front;
        while(current != null){
            size +=1;
            current = current.next;
        }

        return size;
    }

//    printQueue
    public void printQueue(){
        if(isEmpty()){
            return;
        }
        Node current = front;
        System.out.print("Queue: ");
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
