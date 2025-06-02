final class BankAccount {

    private final String accountNumber = "ABC123";

    private double balance = 1000;

    public final void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal.");
        }
    }

    public void showDetails() {
        System.out.println("Account: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}


public class FinalKeywordBank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.showDetails();
        account.withdraw(300);
        account.showDetails();
    }
}
