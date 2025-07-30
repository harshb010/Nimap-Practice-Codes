public class ThreadInterruptDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->
        {
            for(int i=0;i<10;i++)
            {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread Interrupted");
                    return;
                }
            }
        });

        t1.start();
        Thread.sleep(3000);
        t1.interrupt();
    }
}
