class Person {
    int id;
    String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    String course;

    Student(int id, String name, String course) {
        super(id, name);
        this.course = course;
    }

    void enrollCourse() {
        System.out.println(name + " enrolled in " + course);
    }

    @Override
    void displayDetails() {
        System.out.println("\nStudent Details:");
        super.displayDetails();
        System.out.println("Course: " + course);
    }
}

class Faculty extends Person {
    String subject;

    Faculty(int id, String name, String subject) {
        super(id, name);
        this.subject = subject;
    }

    void gradeStudent(String studentName, int marks) {
        System.out.println(name + " graded " + studentName
                + " with marks: " + marks);
    }

    @Override
    void displayDetails() {
        System.out.println("\nFaculty Details:");
        super.displayDetails();
        System.out.println("Subject: " + subject);
    }
}

class AdminStaff extends Person {
    String department;

    AdminStaff(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    void manageRecords() {
        System.out.println(name + " is managing university records.");
    }

    @Override
    void displayDetails() {
        System.out.println("\nAdmin Staff Details:");
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}

public class Inheritance {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Rahul", "Java Programming");
        Faculty f1 = new Faculty(201, "Amit", "Computer Science");
        AdminStaff a1 = new AdminStaff(301, "Priya", "Administration");

        s1.enrollCourse();
        f1.gradeStudent("Rahul", 85);
        a1.manageRecords();

        Person[] people = {s1, f1, a1};

        System.out.println("\n--- University Academic System ---");

        for (Person p : people) {
            p.displayDetails();
        }
    }
}
