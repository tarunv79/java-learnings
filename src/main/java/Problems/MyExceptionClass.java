package Problems;

public class MyExceptionClass extends Exception {
    public MyExceptionClass(String message) {
        super(message);
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }
}
