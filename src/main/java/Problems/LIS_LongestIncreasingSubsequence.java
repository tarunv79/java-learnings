package Problems;

public class LIS_LongestIncreasingSubsequence {

    //public static int[] input = {10, 22, 9, 33, 21, 50, 41, 60, 80};
    //output = 6
    //public static int[] input = {50, 3, 10, 7, 40, 80};
    //output = 4
    //public static int[] input = {3, 10, 2, 11};
    //output = 3

    //public static int[] input = {8, 1, 4, 3, 5, 2, 6, 7 };
    public static int[] input = {1, 2, 3, 4, 5, 6, 7, 8 };

    //this approach is time = O(n2), space = O(1)

    public static void main(String[] args) {
        System.out.println(LIS.calculateLIS(input));
    }

    public static class LIS{
        public static int calculateLIS(int[] arr){
            int len = arr.length;
            //int[] output = new int[len];
            int max = 1;
            for (int i = 0; i<len ; i++){
                int k = findLis(arr,i);
                if(k>max)
                    max=k;
            }
            return max;
        }
        private static int findLis(int[] input, int index) {
            int count = 1;
            int temp = input[index];
            for (int i = index+1; i< input.length; i++){
                if(temp<input[i]){
                    count++;
                    temp=input[i];
                }
            }
            return count;
        }
    }
}
