package Post43.Cloneing;

import java.util.Arrays;

public class Human implements Cloneable {

    int age;
    String name;
    int[] arr;   // to demonstrate shallow vs deep copy

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{1, 2, 3, 4};
    }

    // Copy Constructor (Manual Copy)
    public Human(Human other) {
        this.age = other.age;
        this.name = other.name;
        this.arr = new int[other.arr.length];
        for (int i = 0; i < other.arr.length; i++) {
            this.arr[i] = other.arr[i];
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

        // 1️⃣ Shallow copy
        Human twin = (Human) super.clone();

        // 2️⃣ Deep copy of mutable objects
        twin.arr = new int[this.arr.length];
        for (int i = 0; i < this.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }

        return twin;
    }

    @Override
    public String toString() {
        return "Age: " + age +
                ", Name: " + name +
                ", Arr: " + Arrays.toString(arr);
    }
}
