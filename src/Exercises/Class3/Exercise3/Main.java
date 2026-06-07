package Exercises.Class3.Exercise3;

public class Main {
    static void main() {
        BankAccount account = new BankAccount();
        CheckingAccount checkingaccount = new CheckingAccount();

        account.deposit(1000);
        account.showBalance();

        checkingaccount.deposit(200);
        checkingaccount.monthlyRate();
        checkingaccount.showBalance();
        checkingaccount.withdraw(150);
        checkingaccount.showBalance();
    }
}
