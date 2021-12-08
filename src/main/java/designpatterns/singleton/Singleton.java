package designpatterns.singleton;

import java.io.Serializable;

public class Singleton implements Serializable {

    private Singleton(){}

    private static volatile Singleton instance;

    public static Singleton getInstance(){
        if(instance==null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    protected Object readResolve(){
        return instance;
    }
}
