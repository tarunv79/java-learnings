package corejava.oops;

abstract class BmwBase {
    public void bmwDefault(){
        System.out.println("this is default feature for all BMWs");
    }

    public void colour(){
        System.out.println("lets make black as default color for all BMW");
    }

    public void airbags(){
        System.out.println("lets make default airbags for all BMW");
    }

    abstract void shape();
}
