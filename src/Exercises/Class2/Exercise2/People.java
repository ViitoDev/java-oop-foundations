package Exercises.Class2.Exercise2;

public class People {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void checkAge(int age){
        if (age >= 18) {
            System.out.println("You are 18 or older");
        } else {
            System.out.println("You are over 18 years old");
        }
    }
}
