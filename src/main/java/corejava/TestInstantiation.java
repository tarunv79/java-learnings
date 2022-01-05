package corejava;

import java.util.HashMap;
import java.util.Objects;

public class TestInstantiation {

    /*

    output:
class A method m1
10
null
method of Integer
method of int
method of Integer
method of Object

     */

    public static void main(String[] args) {
        A a = new B();
        a.m1();

        HashMap<Emp,Integer> map = new HashMap<>();
        Emp e = new Emp("Tarun");
        map.put(e,10);
        System.out.println(map.get(e));
        e.setName("Pratik");
        System.out.println(map.get(e));

        C c = new C();
        //c.a((Integer) null);
        c.a( null);
        c.a(2);
        c.a(new Integer(8));
        c.a("Hello");
    }


    static class Emp {
        String name;

        Emp(String s){
            this.name=s;
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(this.name);
        }

        @Override
        public boolean equals(Object obj) {
            Emp e = (Emp)obj;
            return this.name.equals(e.getName());
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}

class A {
    public void m1(){
        System.out.println("class A method m1");
    }
}
class B extends A{
    public void m2(){
        System.out.println("class B method m2");
    }
}
class C {
    public void a(Object s){
        System.out.println("method of Object");
    }
    public void a(Integer o){
        System.out.println("method of Integer");
    }
    public void a(int i){
        System.out.println("method of int");
    }
}