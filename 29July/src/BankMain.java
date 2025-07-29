public class BankMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        try {
            account.withdraw(1500); // more than balance
        } catch (CustomException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}
