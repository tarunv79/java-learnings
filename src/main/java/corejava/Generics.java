package corejava;

public class Generics <T, V> {

    private T var1;
    private V var2;

    public Generics(T t, V v){
        this.var1 = t;
        this.var2 = v;
    }

    public <T> void method1(T t1){
        System.out.println(t1);
        System.out.println(t1.getClass());
        //this.var1 = t1;
    }

    public <T,V> void method2 (T var2, V var1){
        System.out.println(var1);
        System.out.println(var2);
    }

    public <K> void method3 (K k){
        System.out.println(k);
    }

    public static void main(String[] args) {
        Generics<String,Integer> generics = new Generics<>("sdfd",24);
        generics.method1(34);
        generics.method2(31,232);
        generics.method3(3434);
    }


}
