package corejava.oops;


public class CienaMainClass {
    public static void main(String[] args) {
        CienaMain cienaMain = new CienaMain();
        cienaMain.method1();
        cienaMain.method2();
        cienaMain.method3();

    }
}

class CienaMain extends CienaAbstractA implements CienaInterface1{

    @Override
    public void method1() {
        System.out.println("this is method 1 of ciena main");
    }

    @Override
    void method2() {
        System.out.println("this is method 2 of ciena main");
    }
}
abstract class CienaAbstractA {
    abstract void method1();
    abstract void method2();
    public void method3(){
        System.out.println("this is method 3 of abstract class A");
    }
}

interface CienaInterface1 {
    default void method3(){
        System.out.println("this is default method3 of Ciana interface 1");
    }
    void method1();
}

