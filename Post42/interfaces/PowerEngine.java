package Post42.interfaces;

public class PowerEngine implements Engine {
    @Override
    public void acc() {
        System.out.println("Power engine Accelerate");

    }

    @Override
    public void start() {
        System.out.println("Power engine Start");

    }

    @Override
    public void stop() {
        System.out.println("Power engine Stop");

    }

}
