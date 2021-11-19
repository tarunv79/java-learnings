package collections.map;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMap_ {

    //WeakHashMap_ - keys which are not referenced then both key-value are garbage collected
    /*
        WeakHashMap_ is an implementation of the Map interface.
        WeakHashMap_ is almost same as HashMap except in case of WeakHashMap_,
        if object is specified as key doesn’t contain any references- it is eligible for garbage collection
        even though it is associated with WeakHashMap_. i.e Garbage Collector dominates over WeakHashMap_.

        Clone method Implementation: HashMap implements Cloneable interface.
        WeakHashMap does not implement Cloneable interface, it only implements Map interface.
        Hence, there is no clone() method in the WeakHashMap class.
     */

    public static void main(String[] args) throws InterruptedException {
        WeakHashMap_ test = new WeakHashMap_();
        test.demo();
    }
    public void demo() throws InterruptedException {
        HashMap<Demo,String> hashMap = new HashMap<>();
        WeakHashMap<Demo,String> weakHashMap = new WeakHashMap<>();

        Demo d = new Demo();
        hashMap.put(d,"hi");
        weakHashMap.put(d,"hi");

        System.out.println(hashMap);
        System.out.println(weakHashMap);
        d = null;
        System.gc();

        Thread.sleep(10000);
        System.out.println(hashMap);
        System.out.println(weakHashMap);
    }

    class Demo{
        @Override
        protected void finalize() throws Throwable {
            System.out.println("Finalize method called!");
        }
        @Override
        public String toString(){
            return "demo";
        }

    }
}
