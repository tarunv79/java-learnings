package corejava.oops;

public interface Car {
    default void airbags(){
        System.out.println("I have default airbags");
    }
    default void anotherDefaultMethod() {
        System.out.println("this is another default method");
    }
    static void tyres(){
        System.out.println("every car has 4 tyres");
    }
    void shape();
    void colour();
}
