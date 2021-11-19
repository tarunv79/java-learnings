package Learnings;

import java.util.Arrays;

public class PaytmPalindromString {

    public static void main(String[] args) {
        String input1 = "ntiin";
        //String input1 = "naman";
        int output = 0;

        int len = input1.length()-1;
        for(int i = 0; i<len/2; i++){
            if(i==len-1)
                break;
            if(input1.charAt(i)!=input1.charAt(len-i)){
                char[] arr = input1.toCharArray();
                char temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                input1= Arrays.toString(arr);
                output++;
            }
        }

        System.out.println(output);
    }
}
