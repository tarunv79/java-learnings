package dataStructures.stack;

import java.util.Arrays;
import java.util.Stack;

public class StackImpl {

    public static void main(String[] args) {
        Stack stack = new Stack(10);

        java.util.Stack<Integer> stack1 = new java.util.Stack<>();
        stack.add(10);
        System.out.println(Arrays.toString(stack.getStack()));
        stack.add(23);
        stack.add(12);
        System.out.println(stack.remove());
        System.out.println(Arrays.toString(stack.getStack()));
        stack.add(13);
        System.out.println(Arrays.toString(stack.getStack()));
    }

    public static class Stack{
        private int[] stack;
        private int pointer;

        public Stack(int size){
            stack = new int[size];
            pointer=0;
        }
        public void add(int element){
            stack[pointer] = element;
            pointer++;
        }
        public int remove(){
            return stack[(pointer--)-1];
        }
        public int[] getStack(){
            return stack;
        }
    }
}
