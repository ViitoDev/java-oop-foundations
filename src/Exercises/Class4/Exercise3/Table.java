package Exercises.Class4.Exercise3;

public class Table implements MultiplicationTable {

    @Override
    public void showTable(int number) {
        for (int i = 0; i < 11; i++) {
            System.out.println(number + " x " + i + " = " + (number*i));
        }
    }
}
