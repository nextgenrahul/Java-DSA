package Post41.Inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight = -1;
        this.w = 32; // You can access parent class members in a child class if they are not
                     // private.You only need super when there is name conflict or when calling the
                     // parent’s overridden method or constructor.

    }

    public BoxWeight(BoxWeight other) {
        super(other);

    }

    public BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;

    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);// this super method call the parent call constructor # super() must be the
                       // first statement in a constructor. Because the parent part of the object must
                       // be created first.
        // Used to initialize values present in parent class
        // this.weight = weight;
        System.out.println(super.weight); // If you specifically target weight in super class then you have to use
                                          // weight otherwise this
    }

}
