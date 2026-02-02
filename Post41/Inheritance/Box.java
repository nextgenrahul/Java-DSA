package Post41.Inheritance;

public class Box {
    double l;
    double h;
    double w;
    double weight;

    Box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    static void greeting(){
        System.out.println("Hey, I am in box. Greeting");
    }

    // Cube
    Box(double side) {
        // super() = “build the parent   part of me first”
        // If parent is Object, it’s harmless but required
        // Java adds it automatically if you don’t
        // super();
        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box(double l, double h, double w, double weight) {
        this.l = l;
        this.h = h;
        this.w = w;
        this.weight = weight;
    }

    Box(Box old) {
        this.w = old.w;
        this.l = old.l;
        this.h = old.h;
    }

    public void information() {
        System.out.println("Running the box.");
    }

}
