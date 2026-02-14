package Post44.EnumExample;

public class Basic {
    enum Week implements A{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are enum constants
        // public , Static, and final
        // since its final you can create child enums 
        // type is week
         Week() {
            System.out.println("Constructor called for " + this);
        }

        @Override
        public void hello() {
            System.out.println("Hey, how are you");
        }
        // this is not public or protected, only private or default
        // Why we don't want to create new objects
        // This is not enum concept, that's why
        // Internally : public static final week Monday = new Week();
    };

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        week.hello();

        System.out.println(Week.valueOf("Monday"));
        // System.out.println(week);
        // for(Week day: Week.values()){
        //     System.out.println(day);
        // }

        // System.out.println(week.ordinal());
       
    }

}
