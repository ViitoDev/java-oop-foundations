package Class2.Exercise1;

public class Main {
    static void main() {
        BankAccount account = new BankAccount();

        account.setAccountNumber(123);
        account.setBalance(1500);
        account.holder = "Victor";

        System.out.println("Holder name    : " + account.holder);
        System.out.println("Account Number : " + account.getAccountNumber());
        System.out.println("Balance        : " + account.getBalance());
    }
}
