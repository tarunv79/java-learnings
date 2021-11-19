package Problems;

import java.util.HashMap;
import java.util.List;


public class Tree {

    private static final String input = "{Money Heist Info{The most important character is the Professor}{Another character is that of Berlin{Berlin is in charge of the money heist}}{Another character is that of Moscow{Moscow is Denver's dad}}{Another character is that of Rio{Rio is a programmer{Rio is also a decent hacker{Rio is quite happy to be a part of the heist}}}}{Another character is that of Denver}}";

    public static void main(String[] args) {
        HashMap<Integer,List<String>> map = new HashMap<Integer,List<String>>();

        int order = getOrder(input);
        System.out.println("Order is:"+order);

        for (int i = 0; i<order; i++){

        }

    }

    private static int getOrder(String input) {

        int max = 1;
        for (int i = 0; i< input.length(); i++){
            int count = 1;
            while(i<input.length() && input.charAt(i)=='}' && input.charAt(i-1)=='}'){
                count++;
                i++;
                max = Math.max(max,count);
            }
        }
        return max+1;
    }
}
