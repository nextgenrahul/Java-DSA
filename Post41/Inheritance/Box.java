package Post41.Inheritance;

public class Box {
    private double l;
    double h;
    double w;
    double weight;

    Box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    // Cube
    Box(double side) {
        // super() = “build the parent part of me first”
        // If parent is Object, it’s harmless but required
        // Java adds it automatically if you don’t
        // super();
        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void information() {
        System.out.println("Running the box.");
    }

}
