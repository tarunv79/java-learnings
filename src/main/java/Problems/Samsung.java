package Problems;

import java.util.ArrayList;
import java.util.List;

public class Samsung {

    /*
    1. Input - Two sorted arrays (int[] a, int[] b) Output -
    Print all common elements between them.
    If no common element then this information should also be printed.
    Example: 1. Input: ([2,3,5,7,19],[3,6,8,12,34,56,78])  Output: 3
    2. Input: ([2,3,5,7,19],null) Output: No common element
    3. Input: ([2,3,5,7,19],[8,12]) Output: No common element
     */

    public static void main(String[] args) {

        int[] a1 = new int[]{2,3,5,7,19};
        int[] a2 = new int[]{3,6,8,12,34,56,78};

        findCommon(a1,a2);


    }

    private static void findCommon(int[] a1, int[] a2) {
         List<Integer> output = new ArrayList<>();

         if(a1 ==null || a2==null || a1.length==0 || a2.length ==0){
             System.out.println("No common elements");
         }

         if(a1[a1.length-1]>a2[0]){
             //Sysout
         }


             int x = 0;
             int y = 0;

             boolean found = false;
             do {
                 if (a1[x] == a2[y]) {
                     System.out.println(a1[x]);
                     found = true;
                     x++;
                     y++;
                 } else if (a1[x] < a2[y]) {
                     x++;
                 } else if (a1[x] > a2[y]) {
                     y++;
                 }
             }while (x<a1.length && y<a2.length);

          if(!found){
              //System.out
          }
    }
}
