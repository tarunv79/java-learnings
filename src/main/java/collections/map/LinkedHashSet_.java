package collections.map;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSet_ {
    //LinkedHashSet retains insertion order
    //Set is an interface
    //The main difference between Set and Map is that
    //Set is unordered and contains different elements, whereas Map contains the data in the key-value pair.
    //Set doesn't allow us to add the same element to it.
    //It doesn't maintain the insertion order because it contains elements in a sorted way

    //Set doesn't keep insertion order but LinkedHashSet does.
    //HashSet and LinkedHashSet both doesn't allow duplicates.

    public static void main(String[] args) {
        HashSet<Integer> integerHashSet = new HashSet<>();
        HashSet<String> stringHashSet = new HashSet<>();

        LinkedHashSet<Integer> integerLinkedHashSet = new LinkedHashSet<>();
        LinkedHashSet<String> stringLinkedHashSet = new LinkedHashSet<>();

        integerHashSet.add(1);
        integerHashSet.add(3);
        integerHashSet.add(4);
        integerHashSet.add(2);
        integerHashSet.add(2);

        integerLinkedHashSet.add(1);
        integerLinkedHashSet.add(3);
        integerLinkedHashSet.add(4);
        integerLinkedHashSet.add(2);
        integerLinkedHashSet.add(2);

        System.out.println(integerHashSet);
        System.out.println(integerLinkedHashSet);


        stringHashSet.add("ab");
        stringHashSet.add("bf");
        stringHashSet.add("zk");
        stringHashSet.add("cd");
        stringHashSet.add("cd");

        stringLinkedHashSet.add("ab");
        stringLinkedHashSet.add("bf");
        stringLinkedHashSet.add("zk");
        stringLinkedHashSet.add("cd");
        stringLinkedHashSet.add("cd");

        System.out.println(stringHashSet);
        System.out.println(stringLinkedHashSet);
    }




}
