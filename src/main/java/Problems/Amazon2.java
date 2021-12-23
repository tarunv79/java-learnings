package Problems;

/*
	- Problem/program
		○ In an array of integers representing a profit of that day.
		Calculate the maximum profit that can be made out of the given numbers.
		○ Ex .
		○  [4,8,210,2,90,45,80]
			§ If buy at 4 then sell at 210 then buy at 2 and sell at 90 and finally buy at 45 and sell at 80
			§ Then total profit
				□ 210 - 4 = 206
				□ 90 - 2 = 88
				□ 80 - 45 = 35 -> total profit = 206 + 88 + 35 = 329, and this is the maximum profit
		○  [4,8,210,2,90,45,300]
		296
			201-4 -> 90-2 -> 300-45

 */

public class Amazon2 {
    public static void main(String[] args) {

        int[] input = new int[]{4,8,210,2,90,45,300};

        int output = 0;
        int splitPointer = 1;
        for(int i = 0; i<input.length; i++){

        }
    }
}
