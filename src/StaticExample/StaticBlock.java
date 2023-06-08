package src.StaticExample;
//initialization of static variables
public class StaticBlock
{

    static int a=4;
    static int b;


//this static block will run only once
    static{
        System.out.println("I am in static Block");
        b=a*5;

    }


    public static void main(String[] args) {
        StaticBlock obj=new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);

        StaticBlock.b+=3;

        StaticBlock obj2=new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);

    }
}


