package Post39;

public class Main1 {
    public static void main(String[] args) {
        // int[] numbers = new int[5];

        // String[] name = new String[5];

        
        // Data of five student
        // int[] no = new int[5];
        // String[] studentName = new String[5];
        // float[] marks = new float[5];

        // Class = Logical Construct
        // Object = Physical Construct and Object get space in memory and Object have
        // these thre state , identity and behavior and object are stored in heap memory
        // and referenced by variable which are stored in stack memory
        // Student students = new Student(1, "John Doe", 95.5f); // New keyword is used to create object and dynamically allocate memory and
                                          // return the reference of that memory
                                          // Student() :this is speical type of method which is known as constructor 
        // Student students : This part is happen in complile time and this part is
        // stored in stack memory
        // new Student() : This part is happen in runtime and this part is stored in
        // heap memory
        // System.out.println(students.studentName);

        
        // students.displayStudentInfo();
    
        // Student students2 = new Student(); // Calling default constructor
        // students2.displayStudentInfo();

        Student students3 = new Student(); // Calling copy constructor
        students3.displayStudentInfo();

    }

}

// For every single student/oject we have these three properties
class Student {// Class is what its just a blueprint or you can name properties of object
    int no;
    String studentName;
    float marks;

    void displayStudentInfo() {
        System.out.println("Student No: " + this.no);
        System.out.println("Student Name: " +  this.studentName);
        System.out.println("Student Marks: " + this.marks);
    }

    // We need a way to add values of the above properties for every student object
    // this keyword is used to refer current object
    Student(int no, String studentName, float marks) { // Constructor is special type of method which is used to initialize object and It is called automatically when object is created. And its does not return any value and its name is same as class name
        this.no = no;
        this.studentName = studentName;
        this.marks = marks;
    }

    Student(Student other){
        this.no = other.no;
        this.studentName = other.studentName;
        this.marks = other.marks;
    }

    // Constructor Overloading example when you have multiple constructor with different parameter list
    Student() {
        this (0, "Default Constructor", 0.0f); // Calling parameterized constructor from default constructor using this keyword
    }   
}
