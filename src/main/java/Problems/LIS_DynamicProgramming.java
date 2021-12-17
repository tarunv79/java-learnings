package Problems;

import java.util.Arrays;

public class LIS_DynamicProgramming {

    public static void main(String[] args) {
        int[] input = {8, 1, 4, 3, 5, 2, 6, 7 };

        int[] lis = new int[input.length];
        Arrays.fill(lis, 1);

        for(int i = 1; i<input.length ; i++){
            for(int j=0; j<i; j++){
                if(input[j]<input[i] && lis[j]>=lis[i]){
                    lis[i] = lis[i]+1;
                }
            }
        }
        int max = 1;
        for(int k = 0; k<input.length; k++){
            if(lis[k]>max)
                max = lis[k];
        }
        System.out.println("length of LIS is "+max);

        System.out.println("Sequence is = ");
        int pointer = 1;
        for(int i = 0; i<lis.length; i++){
            if(lis[i]==pointer){
                System.out.print(" "+input[i]);
                pointer++;
            }
        }

    }
}
