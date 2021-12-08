package exceptionhandling;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

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
