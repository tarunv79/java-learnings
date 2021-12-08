package exceptionhandling;

public class Test2 {

    public static void main(String[] args) {
        try {
            //System.out.println(1/0);
            System.out.println(1.0 / -0.0);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getStackTrace());
        }
    }
}
