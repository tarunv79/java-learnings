package dataStructures;

public class PriorityQueueUsingHeap<T> {

    class Node {
        T object;
        Node left;
        Node right;
        int priority;

        Node(T o, int p){
            object = o;
            this.priority = p;
            this.left = this.right = null;
        }
    }

    Node root = null;
    Node font = null;
    Node rear = null;

    public void enqueue(T o, int p){
        Node temp = new Node(o,p);
        if(root==null){
            root = temp;
        }else{

        }
    }

}
