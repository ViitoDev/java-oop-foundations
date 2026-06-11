package Exercises.Class5.Exercise1;

import java.util.ArrayList;

public class Main {
    static void main() {
        var people1 = new People("John", 18);
        var people2 = new People("Jake", 16);
        ArrayList<People> people = new ArrayList<>();

        people.add(people1);
        people.add(people2);

        System.out.println("Size of the list : " + people.size());
        System.out.println("The first person is : " + people.getFirst());
        System.out.println("The full list is : ");
        for (People people3 : people) {
            System.out.println(people);
        }
    }
}