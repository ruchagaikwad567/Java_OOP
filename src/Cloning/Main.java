package src.Cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human kunal=new Human(34,"Kunal");
       // Human twin=new Human(kunal);

        Human twin=(Human)kunal.clone();
        System.out.println(twin.age+" "+twin.name);
    }
}
