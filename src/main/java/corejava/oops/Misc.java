package corejava.oops;

public class Misc {
    public static void main(String[] args) {
        System.out.println(10+20+30+"str");
        System.out.println("str"+10+20+30);
        System.out.println(10.2+20+30+"str");
        System.out.println(10+20.2+30+"str");
        System.out.println(20.2+10+"Str"+10+20+40);


        try{
            System.out.println("hi");
            return;
        }catch (Exception e){

        }
    }
}
/*
Output:
60str
str102030
60.2str
60.2str
30.2Str102040
hi
 */
