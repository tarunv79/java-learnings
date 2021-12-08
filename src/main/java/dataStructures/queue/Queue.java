package dataStructures.queue;

public class Queue {
    final class Node {
        Object object;
        Node next;
        public Node(Object o){
            this.object = o;
            this.next = null;
        }
    }

    Node front;
    Node rear;

    public Object enqueue(Object o){
        Node node = new Node(o);
        if(rear==null){
            front=rear=node;
        }
        rear.next=node;
        rear=node;
        return node.object;
    }
    public Object dequeue(){
        if(front==null)
            return -1;

        Object o = front.object;
        front = front.next;
        if(front==null){
            rear = null;
        }
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
