package Post28;

public class StringGuide {
    public static void main(String[] args) {
        String a = new String("Java");
        String b = new String("Java");
        System.out.println(a == b); // false (different heap objects)
        System.out.println(a.equals(b)); // true
    }
}
