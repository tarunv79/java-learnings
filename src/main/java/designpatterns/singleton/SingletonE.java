package designpatterns.singleton;

public class SingletonE {
    public static void main(String[] args) {
        SingletonEE singleton = SingletonEE.INSTANCE;
        System.out.println(singleton);

        singleton.setSingleton(12);
        System.out.println(singleton);
    }
}

enum SingletonEE {
    INSTANCE;
    Object object;
    public Object getSingleton(){
        return object;
    }
    public void setSingleton(Object object){
        this.object = object;
    }
}
