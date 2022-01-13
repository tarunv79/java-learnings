package Problems;

import java.util.Stack;

public class Samsng2 {

    /*

    Input: String of numbers Output: Readable and comma formatted string
     (trillion, million , thousands) examples:
     Input:  1234567 Output: 1,234,567
     Input:  4567 Output: 4,567
     Input:  567 Output: 567
     Input:  56789123456789 Output: 56,789,123,456,789
     -4567 -> -4,567
     */

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        //String input = "1234567";
        String input = "-4500";
        int in = Integer.parseInt(input);
        String output = convert2(in);
        System.out.println(output);
    }

    private static String convert2(int in){
        Stack<Integer> stack = new Stack<>();
        while(in%1000>0) {
            int rem = in % 1000;
            stack.push(rem);
            in = in/1000;
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
            if(!stack.isEmpty())
                sb.append(",");
        }
        return sb.toString();


    }

    private static String convert(int in) {
        if(in%1000<0)
            return String.valueOf(in)+",";
        if(in%1000>0){
            convert(in/1000);
        }
        return ",";
    }


    //1234567 -> 1,234,567

    private static String convert3(int in){
        if(in<1000){
            return in+"";
        }
        int rem = in%1000;
        return convert3(in/1000) + "," + rem;
    }


}
