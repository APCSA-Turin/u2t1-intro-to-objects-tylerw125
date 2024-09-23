public class StudentRunner {
    public static void main(String[] args) {
        
        Student student1 = new Student("Alice", 3.8);
        student1.printStudentInfo();
        System.out.println();
        student1.updateGPA(3.9);
        student1.printStudentInfo();
    }
}
