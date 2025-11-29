public class RecursionExampleWithNotes {
    public static void main(String[] args) {
        // Write a function that takes in a numbers and print it
        // print first 5 number 1, 2, 3, 4, 5
        // Now i understand, what it the behaviour of a function now i start learning
        // recursion
        // Recursion is what , when a function is calling such condition are called
        // recursion
        print1(1);
    }

    // No base condition  => function calls will keep happing , stack will be filled again and again memory of computer will exceed the limits  => stackoverflow errors 
    // Recursion helps us in solving bigger complex problem  in a simpler way that is why we use recursion 
    // you can convert recursion into iteration and vise versa 
    // space 
    static void print1(int n) {
        System.out.println(n);
        print1(n);
        if (n == 5) {
            return;
        }
    }
}
