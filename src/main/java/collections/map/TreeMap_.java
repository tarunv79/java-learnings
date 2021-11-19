package collections.map;

import java.util.TreeMap;

public class TreeMap_ {
    /*
    treemap sorted according to the natural ordering of its keys, or by a Comparator provided at map creation time
    treemap implementation is not synchronized

    HashMap -> not synchronized, no insertion order, no-sorting/natural sorting
    TreeMap -> not synchronized, no insertion order but sorted elements
    LinkedHashMap -> not synchronized, maintains insertion order
     */



    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap();

        treeMap.put(1,"dfd");
        treeMap.put(3,"hjhdf");
        treeMap.put(3,"kkkk");
        treeMap.put(2,"jdjk");

        System.out.println(treeMap);
    }
}
