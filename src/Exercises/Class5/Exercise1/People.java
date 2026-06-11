package Exercises.Class5.Exercise1;

public class People {
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "People: " + name + " (" + age + ")";
    }
}
