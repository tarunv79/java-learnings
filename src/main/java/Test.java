import java.util.Arrays;
import java.util.BitSet;

public class Test{

    public static void main(String[] args) {
        XYZ xyz = new XYZ();
        xyz.abc();

        System.out.println();

        boolean[] bits = new boolean[32];
        System.out.println(Arrays.toString(bits));

        BitSet bitSet = new BitSet();
        //bitSet.
    }
}
abstract class ABC{
    ABC(){
        System.out.println("this is ABC class constructor");
    }
    abstract void abc();
    //abstract public void a();
    //abstract protected void b();

    private void bcs(){
        System.out.println("this is private method of abstract class");
    }
}
class XYZ extends ABC{
    XYZ(){
        System.out.println("this is XYZ class constructor");
    }

    void abc() {
        System.out.println("in xyz");
    }
}