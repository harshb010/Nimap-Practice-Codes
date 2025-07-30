import java.util.concurrent.locks.Lock;

public class MyRunnable {
    int count = 0;

    public int getCount() {
        return count;
    }

    public void counter() {
        count++;
    }
    public static void main(String[] args) throws InterruptedException {
        MyRunnable runnable = new MyRunnable();
        Thread t1 = new Thread(()->{
            for(int i=0;i<1000;i++)
            {
                runnable.counter();
            }
        });
        Thread t2 = new Thread(()->{
            for(int i=0;i<1000;i++)
            {
                runnable.counter();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(runnable.getCount());
    }


}
