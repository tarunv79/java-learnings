package Problems;


/*
Maximum Sum Increasing Subsequence
source - https://www.geeksforgeeks.org/maximum-sum-increasing-subsequence-dp-14/

Given an array of n positive integers.
Write a program to find the sum of maximum sum
subsequence of the given array such that the integers
in the subsequence are sorted in increasing order.
For example, if input is {1, 101, 2, 3, 100, 4, 5},
then output should be 106 (1 + 2 + 3 + 100), if the
input array is {3, 4, 5, 10}, then output should
be 22 (3 + 4 + 5 + 10) and if the input array
is {10, 5, 4, 3}, then output should be 10

 */
public class LIS_MaximumSum {

    //public static int[] input = {1, 101, 2, 3, 100, 4, 5};
    //public static int[] input = {3, 4, 5, 10};
    public static int[] input = {10, 5, 4, 3};


    public static void main(String[] args) {
        System.out.println(calculateLisMaxSum(input));
    }

    public static int calculateLisMaxSum(int[] input) {
        int len = input.length;
        int maxSum = 0;
        for (int i = 0; i<len; i++){
            int skipIndex = i-1;
            for(int k = i; k<len;k++) {
                int current = input[i];
                int currentMax = input[i];
                for (int j = i+1 ; j < len; j++) {
                    if (input[j] > current && j != skipIndex) {
                        currentMax += input[j];
                        current = input[j];
                    }
                }
                skipIndex++;
                if(currentMax>maxSum)
                    maxSum=currentMax;
            }

        }

        return maxSum;
    }
}
