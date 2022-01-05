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
/*
Output:
every car has 4 tyres
I have overridden default airbags method
White BMW
this is shape of Bmw
this is another default method
1
3
4
corejava.oops.Bmw
corejava.oops.Bmw@4dc63996
corejava.oops.Bmw@4dc63996
1304836502
true
class corejava.oops.Bmw
4dc63996
 */