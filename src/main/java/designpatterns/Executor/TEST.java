package designpatterns.Executor;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static designpatterns.Executor.TEST.A.multiplier;

public class TEST {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int c = 0;

        c = A.adder.operate(a,b);
        int d = multiplier.operate(a,b);

        List<String> inputList = Arrays.asList("dog","cat","god","act");

        Set<Set<String>> output = new HashSet<>();

        inputList.stream().forEach(k-> output.add(getAnagram(inputList,k)));

        System.out.println(output);

    }


    @FunctionalInterface
    interface Maths {
        public int operate(int a, int b);
    }

    private static Set<String> getAnagram(List<String> list, String str){
        Set<String> out = new HashSet<>();
        for (String s: list) {
            if(isAnagram(s,str)){
                out.add(s);
            }
        }

        return out;
    }

    private static boolean isAnagram(String s, String str) {
        if(s.length()!=str.length())
            return false;
        if(s.length()==str.length()){
            char[] chars = s.toCharArray();
            for (char c : chars) {
                if(!str.contains(Character.toString(c)))
                    return false;
            }
        }
        return true;
    }

    static class A {
        static Maths adder = (i, j)-> i+j;
        static Maths multiplier = (i,j) -> i*j;
    }

//doggod
//catact
}
