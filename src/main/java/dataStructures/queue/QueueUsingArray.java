package dataStructures.queue;

public class QueueUsingArray {

    public static void main(String[] args) throws Exception {
        Queue queue = new Queue();

        System.out.println(queue.enqueue(24));
        System.out.println(queue.enqueue(23));
        System.out.println(queue.enqueue(545));
        System.out.println(queue.enqueue(3434));

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

    }
    static class Queue{
        Object[] queue = new Object[10];
        //int front = 0;
        int rear = 0;

        public Object enqueue(Object o) throws Exception {
            if(rear<queue.length){
                queue[rear]=o;
                rear+=1;
            }else return new Exception("Queue is Full!!");
            return queue[rear-1];
        }

        public Object dequeue(){
            Object o = queue[0];
            Object[] newArray = new Object[queue.length];

            System.arraycopy(queue,1,newArray,0,rear-1);
            queue=newArray;

            return o!=null ? o : -1;
        }


    }
}
