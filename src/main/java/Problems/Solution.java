package Problems;

public class Solution {
    //ARISTA NETWORKS
    //find if the single linked list is palindrome

    static class Node{
        Object obj;
        Node next = null;
        Node(Object obj){
            this.obj = obj;
        }
    }

    public static Node head;


    public static void main(String[] args) {

        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node (30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(40);
        head.next.next.next.next.next = new Node(30);
        head.next.next.next.next.next.next = new Node(20);
        head.next.next.next.next.next.next.next = new Node(10);

        int len = 1;
        Node current = head;
        while(current.next!=null){
            len++;
            //System.out.println(current.obj);
            current = current.next;

        }
        System.out.println(len);

        Node temp = head;
        current = head;
        for (int i = 1 ; i< len; i++){
            if(i>=len/2){
                temp = current.next;
                temp.next = current;


            }else {
                current = current.next;
            }
        }

        while(current.next!=null){
            len++;
            System.out.println(current.obj);
            current = current.next;

        }
    }

}
