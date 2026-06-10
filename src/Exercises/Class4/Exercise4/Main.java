package Exercises.Class4.Exercise4;

public class Main {
    static void main() {
        DefaultTemperatureConversor conversor = new DefaultTemperatureConversor();
        conversor.celciusToFahrenheit(0);
        System.out.println("-----------------");
        conversor.fahrenheitToCelcius(64);
    }
}
