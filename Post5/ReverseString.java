package Post5;
public class ReverseString {
    public static void main(String[] args) {
        String str = "Shinobi";
        System.out.println("Reversed: " + reverse(str));
    }

    static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
