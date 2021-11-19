package corejava.oops;

public class Bmw extends BmwBase implements Car, FourWheeler {
    @Override
    public void shape() {
        System.out.println("this is shape of Bmw");
    }

    @Override
    public void category() {
        System.out.println("This bmw four wheeler, is of car category");
    }

    @Override
    public void colour() {
        System.out.println("White BMW");
    }

    @Override
    public void airbags(){
        System.out.println("I have overridden default airbags method");
    }
}
