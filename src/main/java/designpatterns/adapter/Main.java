package designpatterns.adapter;

public class Main {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.run("horse");

        Parrot parrot = new Parrot();
        parrot.fly("parrot");


        Adapter_FlyingHorse adapter = new Adapter_FlyingHorse(parrot);
        adapter.run("adapter");
        adapter.fly("adapter");
    }

}
