package dataStructures.queue;

public class Queue {
    final class Node {
        Object object;
        Node next;
        public Node(Object o){
            this.object=o;
        }
    }

    Node front;
    Node rear;

    public Object enqueue(Object o){
        Node node = new Node(o);
        if(front == null){
            front = node;
            rear = front;
            return front.object;
        } else if(front==rear){
            rear = node;
            front.next = rear;
            rear.next=front;
        } else {
            Node temp = rear;
            rear = node;
            temp.next=rear;
            rear.next = temp;
        }
        return rear.object;
    }
    public Object dequeue(){
        if(front==null)
            return -1;

        Object o = front.object;
        Node temp = front.next;
        front = temp;
        return o;
    }
    public Object peek() {
        return front!=null ? front.object : -1;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println(queue.enqueue(12));
        System.out.println(queue.enqueue(122));
        System.out.println("peek->"+queue.peek());
        System.out.println(queue.enqueue(42));
        System.out.println(queue.enqueue(14312));
        System.out.println("peek->"+queue.peek());



        System.out.println("Dequeue...");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }

}
