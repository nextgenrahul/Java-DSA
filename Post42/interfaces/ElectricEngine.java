package Post42.interfaces;

public class ElectricEngine implements Engine {
    @Override
    public void acc() {
        System.out.println("Electric engine Accelerate");

    }

    @Override
    public void start() {
        System.out.println("Electric engine Start");

    }

    @Override
    public void stop() {
        System.out.println("Electric engine Stop");

    }
}
