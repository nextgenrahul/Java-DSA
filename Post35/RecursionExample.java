/*
    RECURSION NOTES
    -------------------------------------------------------
    1. What is Recursion?
       Recursion is when a function calls itself.
       It continues until a "base condition" stops it.
    2. Why Base Condition is Important?
       Without a base condition:
       - Function will call itself infinite times
       - Stack memory will overflow → StackOverflowError
    3. Why Use Recursion?
       - Helps break big problems into smaller sub-problems.
       - Useful in:
         * Tree / Graph problems
         * Divide & Conquer (Merge Sort, Quick Sort)
         * Backtracking (Sudoku, N-Queens)
         * Mathematical problems (factorial, fibonacci)
    4. When to Identify a Problem for Recursion?
       - When the problem has a smaller version of itself.
       - When solution depends on solving the same problem
         but with reduced input (n → n-1, size → smaller).
       - Comes with practice.
    5. Recursion vs Iteration
       - Both can solve most problems.
       - Recursion uses more memory (stack frames).
       - Iteration is usually faster, but recursion gives cleaner logic.

    -------------------------------------------------------
    EXAMPLE: Print numbers from 1 to 5 using recursion
*/
public class RecursionExample {
    public static void main(String[] args) {
        printNumbers(1);
    }
    // Recursive function to print numbers from 1 to 5
    static void printNumbers(int n) {

        // Base condition → Stop when n becomes 6
        if (n > 5) {
            return;
        }
        System.out.println(n);
        // Recursive call → prints next number
        printNumbers(n + 1);
    }
}
