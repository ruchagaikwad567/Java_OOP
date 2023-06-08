package src.StaticExample;

public class Main {
    public static void main(String[] args) {
        Human Kunal=new Human(22,"KUNAL",7800,false);
        Human Rahul=new Human(23,"RAHUL",7600,true);

       //dont access static variable with reference to objects --dont do this --> System.out.println( Rahul.population);
        //System.out.println(Kunal.population);



        //use this
        System.out.println(Human.population);



    }
    static void fun()
    {

       //greeting();
        // you cannot use this bcoz it requires an instance
        //but the function you are using it in does not depend on instances

        //You cannot access non static stuff without referencing their instances in a static context
        Main obj=new Main();
        obj.greeting();
    }

    void greeting()
    {
        fun();
        System.out.println("Hellooooo");
    }

}
