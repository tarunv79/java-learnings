package collections.map;

import java.util.LinkedHashMap;

public class LinkedHashMap_ {
    //LinkedHashMap maintains insertion order

    public static void main(String[] args) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("1","dfjdk");
        linkedHashMap.put("3","fdlj");
        linkedHashMap.put("2","fdkjkd");
        linkedHashMap.put("ste","fjdk");

        System.out.println(linkedHashMap);
    }
}
