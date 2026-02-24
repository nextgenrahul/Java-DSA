package Polymorphism;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) { // different params
        return a + b;
    }

    public int add(int a, int b, int c) { // different number of params
        return a + b + c;
    }

    public String add(String a, String b) { // different types
        return a + b;
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println(obj.add("Rahul ", "Shakya"));
    }
}
