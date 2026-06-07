package Exercises.Class3.Exercise3;

public class CheckingAccount extends BankAccount{
    private double montlhyValue;
    public void monthlyRate () {
        balance -= montlhyValue;
        System.out.println("Monthly value   : " + montlhyValue);
        System.out.println("Current balance : " + balance);
    }
}
