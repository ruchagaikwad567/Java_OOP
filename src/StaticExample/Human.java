package src.StaticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;

static long population;
    public Human(int age,String name,int salary,boolean married)
    {
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married=married;
        //in order to access the static variable use classname not this keyword
        //this.population+=1;

        Human.population+=1;
    }
}
