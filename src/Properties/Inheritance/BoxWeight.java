package src.Properties.Inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(double l,double h,double w,double weight)
    {
        super(l,w,h);
        //used to initialize values present in parent class
        this.weight=-1;
    }

    public BoxWeight()
    {
        super();
    }

    public BoxWeight(BoxWeight other)
    {
        this.weight=other.weight;
    }


}
