package Exercises.Class1.Exercise4;

public class Main {
    static void main() {
        Car car1 = new Car();
        car1.color = "White";
        car1.year = 2006;
        car1.model = "Palio fire";

        car1.showSpecs();
        System.out.println("Car age   : " + car1.showAge());
    }
}
