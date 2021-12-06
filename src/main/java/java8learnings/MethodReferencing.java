package java8learnings;

public class MethodReferencing {
    public static void main(String[] args) {

        /* Instance Method References */
        Deserializer des = String::length;
        System.out.println(des.deserialize("75"));

        Deserializer des2 = StringConverter::convertToInt;
        System.out.println(des2.deserialize("75"));

        Deserializer des3 = StringConverter::convertToIntRule2;
        System.out.println(des3.deserialize("75"));


        /* Constructor References - to reference a constructor of a class */
        //Factory factory = c -> new String(c);
        Factory factory = String::new;
        System.out.println(factory.convert(new char[]{'a','b','c'}));


    }


    static class StringConverter {
        public static int convertToInt(String s){
            return Integer.parseInt(s);
        }

        public static int convertToIntRule2(String s){
            return Integer.parseInt(s) + 1;
        }
    }

    @FunctionalInterface
    interface Deserializer {
        int deserialize(String s);
    }

    @FunctionalInterface
    interface Factory {
        String convert(char[] c);
    }
}


