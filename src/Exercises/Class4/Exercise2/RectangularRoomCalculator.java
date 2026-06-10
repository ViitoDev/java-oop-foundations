package Exercises.Class4.Exercise2;

public class RectangularRoomCalculator implements GeometricCalculate{
    @Override
    public void areaCalculate(double height, double width) {
        System.out.println("The area is : " + height * width + "cm²");
    }

    @Override
    public void perimeterCalculate(double height, double width) {
        System.out.println("The perimeter is : " + (2*(height + width )) +"cm");
    }
}
