package Problems;

import java.util.HashMap;

public class Brillio {
/*
0 1 0 0 0 0 0 0
0 0 0 0 1 0 0 1
0 0 0 0 0 0 1 0
0 0 0 0 0 0 0 0
0 1 1 0 x 1 1 0
0 0 0 0 0 0 0 0
0 0 1 0 0 0 0 0
0 0 0 0 1 0 1 0

 */

    public static void main(String[] args) {
        int[][] input = new int[][]{{0,1},{1,0}};

        HashMap<Integer, Integer> output = calculateQueens(input,1,2,1,-1);
    }

    private static HashMap<Integer, Integer> calculateQueens(int[][] input, int x, int y, int offsetx, int offsety) {

        HashMap<Integer,Integer> output = new HashMap<>();
        int i = x;
        int j = y;
        while(i<7 && j<7){
            if (input[i+offsetx][j+offsety] == 1) {
                output.put(i,j);
                return output;
            }
        }
        return output;
    }

}
