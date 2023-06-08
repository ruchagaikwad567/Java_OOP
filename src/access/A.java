package src.access;

public class A {

    public A(int num) {
        this.num = num;
    }

    public A(int num,String name)
    {
        this.num=num;
        this.name=name;
        this.arr=new int[num];
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num){
        this.num=num;
    }

    private int num;
    //we can access these methods by getters and setters
    String name;
    int[] arr;

}


//access modifieers
//private-only in same class
//public-everywhere
//nothing specified-can be accessed only in same package only if it is inherited
//protected-any where only if it is inherited

