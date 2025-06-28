public class BankAccount {
    private int balance = 1000;

    public void withdraw(int amount) throws CustomException {
        if (amount > balance) {
            throw new CustomException("Not enough funds. Available: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }
}
