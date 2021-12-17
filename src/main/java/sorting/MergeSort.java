package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] input = new int[]{2,5,7,4,12,14,74,39,10,0,-2};

        mergeSort(input,0,input.length-1);
        System.out.println(Arrays.toString(input));
    }

    private static void mergeSort(int[] input, int beginIndx, int endIndx) {

        if(beginIndx<endIndx){
            int mid = beginIndx + (endIndx-beginIndx)/2;
            mergeSort(input,beginIndx,mid);
            mergeSort(input,mid+1,endIndx);
            mergeParts(input,beginIndx,mid,endIndx);
        }

    }
// 2 5 8
// 4 6 7
// 1 2 3 4 5 6
    //begin index = 0
    //end index = 5
    //mid = 0 + (5-1)/2 -> 2

    //part 1 ->  1 2 3
    //part 2 -> 4 5 6

    private static void mergeParts(int[] input, int beginIndx, int mid, int endIndx) {

        int l1 = mid-beginIndx+1; //index start from 0
        int l2 = endIndx-mid;

        int[] L = new int[l1];
        int[] R = new int[l2];

        for(int i=0; i<l1; i++){
            L[i] = input[beginIndx+i];
        }
        for (int j=0; j<l2; j++){
            R[j] = input[mid+1+j];
        }

        int x = 0;
        int y = 0;
        int k = beginIndx;

        while (x<l1 && y<l2){
            if(L[x]<R[y]){
                input[k] = L[x];
                x++;
            }else{
                input[k] = R[y];
                y++;
            }
            k++;
        }
        while(x<l1){
            input[k] = L[x];
            x++;
            k++;
        }
        while (y<l2){
            input[k]=R[y];
            y++;
            k++;
        }
    }
}
