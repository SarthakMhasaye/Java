
class Course {
    int courseId;
    String courseName;
    String instructor;
    double fee;
    static int count = 100;

    Course() {
        courseId = count++;
        courseName = "Not Assigned";
        instructor = "Not Assigned";
        fee = 0.0;
    }

    Course(String courseName, String instructor, double fee) {
        courseId = count++;
        this.courseName = courseName;
        this.instructor = instructor;
        this.fee = fee;
    }

    void display() {
        System.out.println("Course ID: " + courseId);
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor: " + instructor);
        System.out.println("Course Fee: " + fee);
    }
}

public class Constructor {
    public static void main(String[] args) {

        Course c1 = new Course();
        Course c2 = new Course("Java Programming", "Rahul", 5000);
        Course c3 = new Course("Python Programming", "Amit", 4500);

        c1.display();
        c2.display();
        c3.display();
    }
}
