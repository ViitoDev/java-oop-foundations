package Exercises.Class2.Exercise4;

public class Main {
    static void main() {
        Student student = new Student("Victor",0,5,10);

        System.out.println("Student name  : " + student.getName());
        System.out.println("Note 1        : " + student.getNote1());
        System.out.println("Note 2        : " + student.getNote2());
        System.out.println("Note 3        : " + student.getNote3());
        System.out.println("Student media : " + student.calculateMedia());
    }
}
