package designpatterns.adapter;

public class Adapter_FlyingHorse implements Animal{

    Bird bird;

    public Adapter_FlyingHorse(Bird bird){
        this.bird = bird;
    }

    @Override
    public void run(String str) {
        System.out.println("I'm adapter implementing animal and can run! "+str);
    }

    public void fly(String str){
        bird.fly(str);
    }
}
