package collections.map;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTable_ {
    //HashTable_ is synchronized so is thread safe and slower. It cannot have null key.
    /*
    class Hashtable<K,V>
    extends Dictionary<K,V>
    implements Map<K,V>, Cloneable, java.io.Serializable
     */
    //Dictionary cannot have null Keys,

    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new Hashtable();
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("map1","12");
        hashMap.put(null,"234");
        System.out.println(hashMap);

        hashtable.put("str1","1");
        //hashtable.put(null,"1");
        System.out.println(hashtable);


        Hashtable<Integer,String> intHashTable = new Hashtable<>();
        intHashTable.put(1,"fjk");
        intHashTable.put(3,"kjdf");
        intHashTable.put(2,"dfjk");
        System.out.println(intHashTable);
    }
}
