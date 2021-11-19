package corejava.oops;

public class Main {
    public static void main(String[] args) {
        Car.tyres();
        Car bmw = new Bmw();
        bmw.airbags();
        bmw.colour();
        bmw.shape();
        bmw.anotherDefaultMethod();

        int a = 1;
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a+=1);

        System.out.println(bmw.getClass().getCanonicalName());

        System.out.println(bmw);
        System.out.println(bmw.toString());
        System.out.println(bmw.hashCode());
        System.out.println(bmw.toString().equals(bmw.getClass().getCanonicalName()+"@"+Integer.toHexString(bmw.hashCode())));
        System.out.println(bmw.getClass().toString());

        System.out.println(Integer.toHexString(bmw.hashCode()));


    }
}
