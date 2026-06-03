package Exercises.Class2.Exercise2;

public class Main {
    static void main() {
        People people = new People();

        people.setAge(17);
        people.setName("Victor");

        System.out.println("Name : " + people.getName());
        System.out.println("Age  : " + people.getAge());
        people.checkAge(people.getAge());
    }
}
