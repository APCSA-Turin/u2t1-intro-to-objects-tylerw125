public class Student {

    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public void printStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("GPA: " + gpa);
    }

    public void updateGPA(double newGPA) {
        gpa = newGPA;
        System.out.println("Updated GPA: " + gpa);
    }
}

