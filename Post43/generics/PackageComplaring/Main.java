package Post43.generics.PackageComplaring;

public class Main {

    public static void main(String[] args) {
        Student rahul = new Student(1, 90.3f);
        Student kunal = new Student(5, 100.32f);

        if(kunal.compareTo(rahul)){
            System.out.println("kunal has more marks");
        }

    }
}