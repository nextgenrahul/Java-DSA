package Post6;

public class BacktrackingPrintOneToN {
    public static void main(String[] args) {
        printVal(4, 4);
    }

    static void printVal(int i, int n) {
        if(i < 1){
            return;
        }
        printVal(i - 1, n);
        System.out.println("Hello");
    }
}
