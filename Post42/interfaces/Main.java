package Post42.interfaces;

public class Main {
    public static void main(String[] args) {
        // Engine car = new Car();
        // car.a; Not we cannot access it
        // car.acc();
        // car.start();
        // car.stop();
        // car.brake();
        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();
        car.upgradeEngine(null);
    }
    
}
