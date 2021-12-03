package java8learnings;

import java.util.Arrays;
import java.util.Collections;
import java.util.function.*;

public class CollectionLearning {
    public static void main(String[] args) {
        Integer[] arr = {12,33,2323,1,5,3,34,43,42,60};


        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(arr));

    }
}
