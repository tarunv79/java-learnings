package Learnings;

import java.util.Arrays;

public class ZigZagArray {
    public static void main(String[] args) {
        int[] input = {4,3,7,8,6,2,1};

        //expected output = a<b>c<d>e<f>g.....
        boolean flag = true;
        for (int i =0; i<input.length-1; i++){

            if(flag){
                if(input[i]>input[i+1]){
                    int temp = input[i];
                    input[i]=input[i+1];
                    input[i+1]=temp;
                }
                System.out.print(">");
                flag=false;
            }else {
                if(input[i]<input[i+1]){
                    int temp = input[i];
                    input[i]=input[i+1];
                    input[i+1]=temp;
                }
                System.out.print("<");
                flag=true;
            }
        }

        System.out.println(Arrays.toString(input));
    }
}
