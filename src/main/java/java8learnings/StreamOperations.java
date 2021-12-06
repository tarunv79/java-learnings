package java8learnings;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperations {
    public static void main(String[] args) {
        //find out top 3 numbers
        List<String> input = Arrays.asList("10","30","20","50","70","100");

        List<String> output = input.stream().map(k-> String.valueOf(k)).sorted().limit(3).collect(Collectors.toList());

        System.out.println(output);

        output = input.stream().sorted().limit(3).collect(Collectors.toList());

        System.out.println(output);

        output = input.stream().sorted().skip(2).limit(3).collect(Collectors.toList());

        System.out.println(output);

        Comparator<String> compareIntVal = Comparator.comparing(Integer::valueOf);

        output = input.stream().sorted(compareIntVal).limit(3).collect(Collectors.toList());

        System.out.println(output);

        //Comparable.copareTo(object)
        //Comparator.comparing(o1,o2);
        //Comparator.compare(--custom--);
        output = input.stream().sorted(Collections.reverseOrder(compareIntVal)).limit(3).collect(Collectors.toList());

        System.out.println(output);
    }
}
