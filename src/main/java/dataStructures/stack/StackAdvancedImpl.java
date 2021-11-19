package dataStructures.stack;

import dataStructures.stack.StackAdvanced;

import java.util.Arrays;

public class StackAdvancedImpl {
    public static void main(String[] args) {
        StackAdvanced stack = new StackAdvanced();
        stack.push(25);
        stack.push(34);
        stack.push(45);
        stack.push(89);
        stack.push(98);

        System.out.println("size="+stack.getStackSize());

        System.out.println(stack.pop().toString());
        System.out.println(stack.pop().toString());
        System.out.println(stack.pop().toString());
        System.out.println("size="+stack.getStackSize());


        StackAdvanced stack2 = new StackAdvanced();
        stack2.push("hi");
        stack2.push("this");
        stack2.push("is");
        System.out.println("size="+stack2.getStackSize());

        stack2.push("tarun");
        stack2.push(1);
        stack2.push(Arrays.asList(1,2,3));
        System.out.println("size="+stack2.getStackSize());

        System.out.println("Total Memory="+Runtime.getRuntime().totalMemory());

        for(int i =0; i<3; i++)
            System.out.println(stack2.pop());

        System.out.println("size="+stack2.getStackSize());


        System.out.println("pushing now....");
        StackAdvanced stack3   = new StackAdvanced();
        for(int i=101;i<=120;i++){
            System.out.println(stack3.push(i));
        }
        System.out.println("popping now....");
        for (int i=0;i<20;i++){
            System.out.println(stack3.pop());
        }


    }
}
