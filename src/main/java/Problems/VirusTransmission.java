package Problems;

import java.util.Scanner;
import java.util.*;

/* Sample Inputs
4
4 5
02_20
21212
_121_
__2__
3 3
_1_
101
_1_
2 3
1_2
_0_
1 2
0_
 */

class VirusTransmission {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of TCs..");
        int t = sc.nextInt();
        for (int a = 0; a < t; a++) {
            System.out.println("New TC, enter m");
            int m = sc.nextInt();
            System.out.println("enter n");
            int n = sc.nextInt();
            char[][] mxn = new char[m][n];
            for (int i=0;i<m;i++){
                System.out.println("enter next n, m values as string..");

                String str = sc.next();
                mxn[i] = str.toCharArray();
            }

            System.out.println("Input Matrix for TC is: "+Arrays.deepToString(mxn));
            executeTestCase(mxn,m,n);

        }
   }

    private static void executeTestCase(char[][] input, int m, int n){
        /* _ = emtpy
           0 = infected
           1 = partial (take 1 day to get infected)
           2 = healthy (take 2 days to get infected)
            [0, 2, _, 2, 0],
            [2, 1, 2, 1, 2],
            [_, 1, 2, 1, _],
            [_, _, 2, _, _]
         */

        int days = 0;
        boolean isZero = false;
        boolean isOne = false;
        boolean isTwo = false;

        scan(input,m,n,isZero,isOne,isTwo);
        if(!isZero){
            System.out.println("Answer = 0");
        }

        for (int i = 0; i<m ;i++){
            for(int j=0; j<n ; j++){
                char cell = input[i][j];
                boolean changed = false;
                if(cell=='0'){
                    //infected cell, find adjacent ones
                    char c1 = getInput(input,i,j+1);
                    char c2 = getInput(input,i,j-1);
                    char c3 = getInput(input,i+1,j);
                    char c4 = getInput(input,i-1,j);

                    if(c1=='1'){
                        input[i][j+1]='0';
                        changed = true;
                    }else if (c1 == '2'){
                        input[i][j+1]='1';
                        changed = true;
                    }
                    if(c2=='1'){
                        input[i][j-1]='0';
                        changed = true;
                    }else if(c2=='2'){
                        input[i][j-1]='1';
                        changed = true;
                    }
                    if(c3=='1'){
                        input[i+1][j]='0';
                        changed = true;
                    }else if(c3 == '2'){
                        input[i+1][j]='1';
                        changed = true;
                    }
                    if(c4=='1'){
                        input[i-1][j]='0';
                        changed = true;
                    }else if(c4== '2'){
                        input[i-1][j]='1';
                        changed = true;
                    }
                }
            }
        }

    }

    private static void scan(char[][] input, int m, int n, boolean isZero, boolean isOne, boolean isTwo) {
        for (int i = 0; i<m ;i++){
            for(int j=0; j<n ; j++){
                char cell = input[i][j];
                if(cell=='0') {
                    isZero = true;
                }else if(cell == '1'){
                    isOne  = true;
                }else if(cell == '2'){
                    isTwo = true;
                }
            }
        }
    }


    private static char getInput(char[][] input, int i, int j) {
        if(i>=0 && j>=0 && i<input.length && j<input.length){
            return input[i][j];
        }
        return 'z';
    }

}