package Learnings;


// Given a list of N rectangles in a 2-D cartesian coordinate system whose sides are parallel to axes of the coordinate planes. A rectangle can be overlapping with other rectangles or it can be isolated too. Two overlapping rectangles shall be replaced by another rectangle which contains both the previous rectangles and has a minimum area possible. For example, look at the below case:

// Given two overlapping rectangles A and B (in solid lines on left) which shall be replaced by a bigger rectangle P(on the right) that contains both of them.

// Input:
// Given n input rectangles and each rectangle is represented as a list (Ex: x1, y1, x2, y2). Here x and y coordinate of the bottom-left(x1, y1)  corner and the top-right corner(x2, y2) of the rectangle respectively

// This process will continue until all the overlapping rectangles are resolved. Once the process completes please provide the list of non-overlapping rectangles.


// rect_arr = [[0,0,4,4], [2,2,4,4], [7,7,10,10], [12,12,14,14],[3,3,5,5]]
// Ans: [[0, 0, 5, 5], [7, 7, 10, 10], [12, 12, 14, 14]]

/*
 * Click `Run` to execute the snippet below!
 */
public class RectangleMergeInstaBase {

    public static void main(String[] args) {
        int[][] rect_arr = {{0,0,4,4}, {2,2,4,4}, {7,7,10,10}, {12,12,14,14},{3,3,5,5}};

        int[][] output = findMergedRect(rect_arr);

        for(int i = 0; i< output.length; i++){
            System.out.print("[");
            for(int j = 0; j<4; j++){
                System.out.print(output[i][j]+", ");
            }
            System.out.println("]");
        }

    }

    public static int[][] findMergedRect(int[][] rect_arr){
        int[][] output = new int[rect_arr.length][4];
        int counter = 0;

        boolean isMerged = false;

        do{
            counter = 0;
            rect_arr = output;
            isMerged = false;
            for(int i=0; i< output.length-1; i++){
                counter = 0;
                int[] a1 = output[i];
                int[] a2 = output[i+1];

                if(a2[0]<a1[2] && a2[1]<a1[3]){
                    int minx1 = Math.min(a1[0],a2[0]);
                    int miny1 = Math.min(a1[1],a2[1]);

                    int maxx1 = Math.max(a1[2],a2[2]);
                    int maxy1 = Math.max(a1[3],a2[3]);
                    int[] o1 = {minx1,miny1,maxx1,maxy1};

                    output[counter] = o1;
                    counter++;

                    isMerged = true;

                }else{
                    output[counter] = rect_arr[i];
                    counter++;
                    output[counter]= rect_arr[i+1];
                    counter++;
                }

            }
        }while(isMerged);

        return output;

    }
}
