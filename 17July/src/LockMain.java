public class LockMain {
    public static void main(String[] args) {

        BankAccount sbi = new BankAccount();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    sbi.withdraw(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t1 = new Thread(runnable,"Thread 1");
        Thread t2 = new Thread(runnable,"Thread 2");

        t1.start();
        t2.start();
    }
}
