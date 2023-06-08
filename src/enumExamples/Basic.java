package src.enumExamples;

public class Basic {

    enum Week{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
        //these are enum constants
        //this is declared as public,static and final
        //since this final you can create child enums
        //type is Week
        Week()
        {
            System.out.println("Constructor called for"+this.toString());
        }
        //this is not public or protected,only private or default
        //we dont want to create new objects
        //internally: public static final Week Monday=new Week()
        //enum cant extend any class
        //but enum can implement as many interfaces as you want
        
    }

    public static void main(String[] args) {
        Week week;
        week=Week.Thursday;

        //for(Week day:Week.values())
      //  {
      //      System.out.println(day);
      //  }
    }
}
