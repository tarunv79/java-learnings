package Problems;

import java.util.Arrays;

/*
You are given a set of n types of rectangular 3-D boxes,
where the i^th box has height h(i), width w(i) and depth d(i) (all real numbers).
You want to create a stack of boxes which is as tall as possible,
but you can only stack a box on top of another box if the dimensions of the
2-D base of the lower box are each strictly larger than those of the 2-D base
of the higher box. Of course, you can rotate a box so that any side functions as its base.
It is also allowable to use multiple instances of the same type of box.
Sample input = {4, 6, 7}, {1, 2, 3}, {4, 5, 6}, {10, 12, 32}
Output = 60
{ {2, 1, 3}, {3, 2, 1}, {5, 4, 6}, {6, 5, 4}, {7, 6, 4}, {12, 10, 32}, {32, 12, 10}}
{ {3, 1, 2}, {1, 2, 3}, {6, 4, 5}, {4, 5, 6}, {4, 6, 7}, {32, 10, 12}, {10, 12, 32}}

 */
public class BoxStacking {
    public static int[][] input = {{4, 7, 6}, {1, 2, 3}, {4, 6, 5}, {10, 12, 32}};

    public static void main(String[] args) {
        int len = input.length;
        int[][] in = new int[len*3][3];

        System.out.println(Arrays.deepToString(input));

        //generate rotations
        int pointer = 0;
        for(int i = 0 ; i<len; i++){
            int[] e = input[i];
            in[pointer] = getArray(e[0],Math.max(e[1],e[2]), Math.min(e[1],e[2]));
            pointer++;
            in[pointer] = getArray(e[1],Math.max(e[0],e[2]),Math.min(e[0],e[2]));
            pointer++;
            in[pointer] = getArray(e[2],Math.max(e[1],e[0]),Math.min(e[1],e[0]));
            pointer++;
        }
        System.out.println(Arrays.deepToString(in));

        //sort by Area (bxc)
        boolean swap = true;
        len = in.length;
        for (int k = 0; k < len && swap; k++) {
            swap = false;
            for (int i = 0; i < len - 1; i++) {
                int a1 = in[i][1] * in[i][2];
                int a2 = in[i + 1][1] * in[i + 1][2];
                if (a1 < a2) {
                    int[] temp = in[i];
                    in[i] = in[i + 1];
                    in[i + 1] = temp;
                    swap = true;
                }
            }
        }
        System.out.println("Sorted by Area = "+Arrays.deepToString(in));

        //find the maximum height by considering only elements with strictly decreasing base area
        int sum = 0;
        for(int i = 0; i < len; i++){
            int current = in[i][0];
            int b = in[i][1];
            int c = in[i][2];
            int currentSum = current;
            pointer = i-1;
            for(int j = i; j < len; j++){
                for(int k = i; k<len ; k++){
                    if(k!=pointer && in[k][1]<b && in[k][2]<c){
                        currentSum+=in[k][0];
                        b=in[k][1];
                        c=in[k][2];
                    }
                }
                if(currentSum>sum){
                    sum = currentSum;
                }
                pointer+=1;
            }
        }
        System.out.println("Maximum Height is "+sum);

    }

    private static int[] getArray(int a, int b, int c){
        return new int[]{a,b,c};
    }

    private static void sort(int[] arr){
        int len = arr.length;
        boolean updated = true;
        //System.out.println("Sorting.."+Arrays.toString(arr));
        for(int j = 0;j<len ; j++) {
            if(updated) {
                updated = false;
                for (int i = 0; i < len - 1; i++) {
                    if (arr[i] > arr[i + 1]) {
                        int temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i+1] = temp;
                        updated = true;
                    }
                }
            }else {
                break;
            }
        }
        //System.out.println("Sorted:: "+ Arrays.toString(arr));
    }




}
