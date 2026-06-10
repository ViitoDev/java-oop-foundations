package Exercises.Class4.Exercise4;

public class DefaultTemperatureConversor implements TemperatureConversor {
    @Override
    public void celciusToFahrenheit(int number) {
        double fahrenheit = ((number * (5 / 9) + 32));
        System.out.println("Celcius    : " + number);
        System.out.println("Fahrenheit : " + fahrenheit);
    }

    @Override
    public void fahrenheitToCelcius(double number) {
        double celcius = (number - 32) * (5.0 / 9.0);
        System.out.println("Celcius    : " + celcius);
        System.out.println("Fahrenheit : " + number);
    }
}
