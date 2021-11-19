package designpatterns.adapter;

public class Parrot implements Bird{
    @Override
    public void fly(String str) {
        System.out.println("I can fly!! " + str);
    }
}
