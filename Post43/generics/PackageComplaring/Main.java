package Post43.generics.PackageComplaring;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Student rahul = new Student(1, 90.3f);
        Student kunal = new Student(4, 400.32f);
        Student arpit = new Student(5, 300.32f);
        Student karna = new Student(9, 100.32f);
        Student sachin = new Student(2, 200.32f);

        Student[] list = { kunal , rahul, arpit, karna, sachin};

        System.out.println(Arrays.toString(list));
        // Arrays.sort(list);
        // Arrays.sort(list, new Comparator<Student>() {
        //     @Override
        //     public int compare(Student o1, Student o2){
        //         return (int)(o1.marks - o2.marks);
        //     }
        // }); // Also we can do this as well

        // Lambda expressions
        Arrays.sort(list, (o1, o2) -> -(int)(o1.marks - o2.marks));

        System.out.println(Arrays.toString(list));
        if (kunal.compareTo(rahul) > 0) {
            System.out.println("kunal has more marks");
        }

    }
}