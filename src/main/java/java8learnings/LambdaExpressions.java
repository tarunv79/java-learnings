package java8learnings;

import java.util.Objects;
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

        //Consumer<String> printIt = (i) -> System.out.println(i);
        Consumer<String> printIt = System.out::println;
        printIt.accept("consumer is printing this");

        Supplier<String> supplierMessage = () -> "this is the message by supplier";
        System.out.println(supplierMessage.get());

        //Function<String,Integer> converter = (k) -> k.length();
        Function<String,Integer> converter = String::length;
        System.out.println(converter.apply("TarunVishwakarma"));

        //BinaryOperator<Integer> adder = (x,y) -> x + y;
        BinaryOperator<Integer> adder = Integer::sum;
        //BinaryOperator<String> concat = (s1, s2) -> s1+s2;
        BinaryOperator<String> concat = String::concat;
        BinaryOperator<Integer> divider = (i,j) -> i!=0 && j!=0 ? i/j : 0;

        System.out.println(adder.apply(4,5));
        System.out.println(divider.apply(14,7));
        System.out.println(concat.apply("hello","tarun"));

        //UnaryOperator<String> toUpperCase = (s)-> s.toUpperCase();
        UnaryOperator<String> toUpperCase = String::toUpperCase;
        System.out.println(toUpperCase.apply("Tarunv"));

        CustomFunctionalInterface myInterface = i -> i+1;
        System.out.println(myInterface.execute(3));

        //CustomFunctionalInterfaceParameterized<String> toLower = (i) -> i.toLowerCase();
        CustomFunctionalInterfaceParameterized<String> toLower = String::toLowerCase;
        System.out.println(toLower.execute("OhhCoNVertITtoLOweR"));

        //FITR<Integer,String> myInterfaceTR = (r)-> Integer.parseInt(r);
        FITR<Integer,String> myInterfaceTR = Integer::parseInt;
        System.out.println(myInterfaceTR.execute("6"));

        //FITR<String,Student> callToStringOfObject = o-> o.toString();
        FITR<String,Student> callToStringOfObject = Student::toString;
        System.out.println(callToStringOfObject.execute(new Student("Tarun")));

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

    static class Student {
        private String name;

        public Student(String s){
            this.name = s;
        }

        @Override
        public String toString() {
            return "Student Name is : "+this.name;
        }

        @Override
        public int hashCode() {
            return Objects.hash(this.name);
        }

        @Override
        public boolean equals(Object obj) {
            return this.name.equals(((Student)obj).getName());
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
