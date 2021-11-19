package designpatterns.adapter;

public class Horse implements Animal {


    @Override
    public void run(String str) {
        System.out.println("I can run! "+str);
    }
}
