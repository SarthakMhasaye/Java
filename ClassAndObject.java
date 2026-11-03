
class Student {
    int rollNo;
    String name;
    String branch;
    double marks;

    void display() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("Marks: " + marks);
    }
}

public class ClassAndObject {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.rollNo = 101;
        s1.name = "Rahul";
        s1.branch = "INFORMATION TECHNOLOGY";
        s1.marks = 85.5;

        s2.rollNo = 102;
        s2.name = "Amit";
        s2.branch = "INFORMATION TECHNOLOGY";
        s2.marks = 90.0;

        System.out.println("Student 1 Details:");
        s1.display();

        System.out.println("\nStudent 2 Details:");
        s2.display();
    }
}
