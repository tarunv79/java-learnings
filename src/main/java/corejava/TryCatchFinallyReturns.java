package corejava;

public class TryCatchFinallyReturns {

    public static void main(String[] args) {
        int i = method();
        System.out.println(i);
    }
    public static int method(){
        try{
            return 1;
        }catch (Exception e){
            return 2;
        }finally {
            return 3;
        }
    }
}
