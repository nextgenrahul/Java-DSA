package Post41.Polymorphism;

public class ObjectPrint {
    int num;

    ObjectPrint(int num) {
        this.num = num;
    }

    public String toString() {
        return "Object Print {" + "num =" + num + "}";
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(40);
        System.out.println(obj);
    }
}
