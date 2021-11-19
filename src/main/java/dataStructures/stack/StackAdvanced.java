package dataStructures.stack;

public class StackAdvanced {
    private Object[] object = new Object[2];
    private int top = -1;

    public StackAdvanced(){}

    public final boolean empty(){
        return this.top==-1;
    }

    public final Object pop(){
        if(top==-1)
            return new Exception("EmptyStackException");
        Object obj = object[top];
        object[top]=null;
        --top;
        Object[] newObject = new Object[(object.length)-1];
        System.arraycopy(object,0,newObject,0,object.length-1);
        this.object= newObject;
        System.gc();
        return obj;
    }

    public final Object push(Object obj){
        if(top==object.length-1){
            Object[] newObject = new Object[(object.length)+1];
            System.arraycopy(object,0,newObject,0,object.length);
            this.object=newObject;
            Runtime.getRuntime().gc();
        }
        top++;
        this.object[top]=obj;
        return obj;
    }

    public int getStackSize(){
        return this.object.length;
    }

}
