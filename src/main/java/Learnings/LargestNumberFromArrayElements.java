package Learnings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class LargestNumberFromArrayElements {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,68,97,9,21,12);

        Collections.sort(numbers,(a,b)-> (String.valueOf(b)+a).compareTo(String.valueOf(a)+b));


        numbers.sort((a, b) -> (String.valueOf(b) + a).compareTo(String.valueOf(a) + b));

        numbers.stream().forEach(k-> System.out.print(k));

        String result = numbers.stream().map(Objects::toString).collect(Collectors.joining(""));
        System.out.println("\nResult is: "+result);
    }
}
