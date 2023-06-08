package src.Singleton;

public class Singleton {

    //make constructor private
    private Singleton()
    {

    }
private static Singleton instance;
    public static Singleton getInstance()
    {
        //check whether one obj is created or not
        if(instance==null)
        {
            instance=new Singleton();
        }
        return instance;

    }
}
