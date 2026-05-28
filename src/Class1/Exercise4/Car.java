package Class1.Exercise4;

public class Car {
    String model;
    int year;
    String color;
    int age = 2026;

    void showSpecs () {
        System.out.println("Car model : " + model);
        System.out.println("Year      : " + year);
        System.out.println("Car color : " + color);
    }

    int showAge () {
        return age - year;
    }
}
