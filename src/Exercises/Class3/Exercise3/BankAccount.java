package Exercises.Class3.Exercise3;

public class BankAccount {
    protected double balance;

    public void deposit(double value){
        balance += value;
        System.out.println("Value of deposit  : " + value);
        System.out.println("Current value     : " + balance);
    }

    public void withdraw(double value){
        if (value <= balance) {
            balance -= value;
            System.out.println("Withdraw value : " + value);
            System.out.println("Current value  : " + balance);
        } else {
            System.out.println("You don't have enough balance.");
        }
    }

    public void showBalance() {
        System.out.println("---------------------------");
        System.out.println("Current balance : " + balance);
        System.out.println("---------------------------");
    }

}
