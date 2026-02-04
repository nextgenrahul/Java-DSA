package Post42.interfaces;

public class CDPlayer implements Media{
    @Override
    public void start() {
        System.out.println("Rock Music");
    }

    @Override
    public void stop() {
        System.out.println("Music Stop");
        
    }
     
}
