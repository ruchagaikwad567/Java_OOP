package src.Intro;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] rno=new int[5];
        String[] name=new String[5];
        float[] marks=new float[5];

        Student[] students=new Student[5];

        //just declaring
        Student kunal;

        System.out.println(Arrays.toString(students));
//when student is not initialized then value will be null

        //object is instantiated i.e declared and initialized
        Student stud1=new Student(13,"Stud",89.78F);

        //System.out.println(stud1.rno);

        Student k=new Student();

        k.greeting();
        k.changeName("me");

        System.out.println(stud1.rno + stud1.name+ stud1.marks);

        Student random= new Student(stud1);

        System.out.println(random.rno+random.name+random.marks);

        Student random2=new Student();

        Student one=new Student();
        Student two=one;
        one.name="something something";

        System.out.println(two.name);

        //final keyword
        final int INCREASE=2;
        //now INCREASE cannot be modified so always initialize while declaring



    }
     static class Student{
        int rno;
        String name;
        float marks;

        /*public Student() {
            this.name="Kunal";
            this.rno=34;
            this.marks=78.90F;
        }*/

        public Student(int rno,String name,float marks)
        {
            this.marks=marks;
            this.name=name;
            this.rno=rno;
        }

        Student(Student other)
        {
            this.name=other.name;
            this.rno=other.rno;
            this.marks=other.marks;
        }

        Student()
        {
            this(13,"default person",89.00f);
        }


        void changeName(String newname)
        {
            System.out.println("My changed name is"+ newname);
        }

        void greeting()
        {
            System.out.println("Heloo my name is "+this.name);
        }


    }
    class A{
        final int num=2;
        String name="Ruh";
    }


}
