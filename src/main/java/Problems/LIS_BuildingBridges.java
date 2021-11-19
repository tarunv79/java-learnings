package Problems;


/*

source - https://www.geeksforgeeks.org/variations-of-lis-dp-21/

1. Building Bridges: Consider a 2-D map with a horizontal river passing through its center.
There are n cities on the southern bank with x-coordinates a(1) … a(n)
and n cities on the northern bank with x-coordinates b(1) … b(n).
You want to connect as many north-south pairs of cities as possible with bridges
 such that no two bridges cross. When connecting cities, you can only connect
 city i on the northern bank to city i on the southern bank.

8     1     4     3     5     2     6     7
<---- Cities on the other bank of river---->
--------------------------------------------
  <--------------- River--------------->
--------------------------------------------
1     2     3     4     5     6     7     8
<------- Cities on one bank of river------->


 */
public class LIS_BuildingBridges {

    public static int[] input_north = {8, 1, 4, 3, 5, 2, 6, 7 };
    public static int[] input_south = {1, 2, 3, 4, 5, 6, 7, 8 };

    public static void main(String[] args) {
        int lisN = LIS_LongestIncreasingSubsequence.LIS.calculateLIS(input_north);
        int lisS = LIS_LongestIncreasingSubsequence.LIS.calculateLIS(input_south);
        System.out.println("Result="+lisN+lisS+" Answer="+Math.min(lisN,lisS));
    }
}
