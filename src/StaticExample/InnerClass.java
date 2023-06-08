package src.StaticExample;
//outside classes cannot be static only inner classes can be static
public class InnerClass {
    static class Test{
        static String name;

        public Test(String name)
        {
            this.name=name;
        }

    }
    //this class being static means it does not depend on objects of Innerclass, it can have its own objects like in


    public static void main(String[] args) {
        Test a=new Test("KUNAL");
        Test b=new Test("RAHUL");

    }
}
