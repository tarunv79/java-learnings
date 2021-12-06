package java8learnings;

import java.util.function.*;

public class LambdaExpressions {
    /*
    Functional Interfaces:
    Predicate
    Consumer
    Supplier
    Function
    UnaryOperator
    BinaryOperator
     */
    public static void main(String[] args) {
        Predicate<String> stringLength = (s)-> s.length() < 10;
        System.out.println(stringLength.test("tarun"));

        Consumer<String> printIt = (i) -> System.out.println(i);
        printIt.accept("consumer is printing this");

        Supplier<String> supplierMessage = () -> "this is the message by supplier";
        System.out.println(supplierMessage.get());

        Function<String,Integer> converter = (k) -> k.length();
        System.out.println(converter.apply("TarunVishwakarma"));

        BinaryOperator<Integer> adder = (x,y) -> x + y;
        BinaryOperator<String> concat = (s1, s2) -> s1+s2;
        BinaryOperator<Integer> divider = (i,j) -> i!=0 && j!=0 ? i/j : 0;

        System.out.println(adder.apply(4,5));
        System.out.println(divider.apply(14,7));
        System.out.println(concat.apply("hello","tarun"));

        UnaryOperator<String> toUpperCase = (s)-> s.toUpperCase();
        System.out.println(toUpperCase.apply("Tarunv"));

        CustomFunctionalInterface myInterface = (i) -> i+1;
        System.out.println(myInterface.execute(3));

        CustomFunctionalInterfaceParameterized<String> toLower = (i) -> i.toLowerCase();
        System.out.println(toLower.execute("OhhCoNVertITtoLOweR"));

        FITR<Integer,String> myInterfaceTR = (r)-> Integer.parseInt(r);
        System.out.println(myInterfaceTR.execute("6"));



    }

    @FunctionalInterface
    interface CustomFunctionalInterface {
        int execute(int k);
    }

    @FunctionalInterface
    interface CustomFunctionalInterfaceParameterized <T> {
        T execute(T t);
    }

    @FunctionalInterface
    interface FITR <T , R> {
        T execute(R r);
    }
}
