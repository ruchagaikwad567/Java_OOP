package src.Properties.Inheritance;

public class Box {
    double l;
    double h;
    double w;


    Box()
    {
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }

    //cube
    Box(double side)
    {
        this.w=side;
        this.l=side;
        this.h=side;
    }


    Box(double h,double l,double w)
    {
        this.l=l;
        this.w=w;
        this.h=h;
    }

    Box(Box old)
    {
        this.l=old.l;
        this.h=old.h;
        this.w=old.w;
    }

    public void information()
    {
        System.out.println("Running the box");
    }
}
