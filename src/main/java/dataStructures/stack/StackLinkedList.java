package dataStructures.stack;

public class StackLinkedList {

    final class Node {
        Object object;
        Node next;
        public Node(Object obj){
            this.object=obj;
        }
    }

    private Node topNode;

    public final Object peek(){
        return this.topNode!=null ? this.topNode.object : null;
    }

    public final Object push(Object obj){
        Node node = new Node(obj);
        if(topNode==null) {
            topNode = node;
        }else {
            Node temp = topNode;  //VIMP Step
            topNode = node;       //VIMP Step
            topNode.next = temp;  //VIMP Step
        }
        return peek();
    }

    public final Object pop(){
        if(topNode==null)
            return new Exception("EmptyStack!!");
        Object o = topNode.object;
        topNode=topNode.next;
        return o;
    }


    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();
        stack.push(12);
        stack.push(13);
        stack.push(14);
        System.out.println(stack.peek());

        for(int i=0; i<2;i++){
            System.out.println(stack.pop());
        }
        System.out.println(stack.peek());


        System.out.println("Pushing now...");
        for(int i=131;i<145;i++){
            System.out.println(stack.push(i));
        }
        System.out.println("Popping now...");
        for (int i = 1;i<20;i++){
            System.out.println(stack.pop());
        }
    }


}
