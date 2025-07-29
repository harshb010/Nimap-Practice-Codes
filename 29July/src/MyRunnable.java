import org.w3c.dom.css.Counter;

public class MyRunnable {
    int count = 0;

    public int getCount() {
        return count;
    }

    public void Counter() {
        count++;
    }

    public static void main(String[] args) throws InterruptedException {
        MyRunnable m = new MyRunnable();
    Thread t1 = new Thread(() -> {
        for(int i=0;i<1000;i++)
        {
            m.Counter();
        }});
        Thread t2 = new Thread(() -> {
            for(int i=0;i<1000;i++)
            {
               m.Counter();
            }});

    t1.start();
    t2.start();
    t1.join();
    t2.join();

  //  m.getCount();
        System.out.println(m.getCount());
    }
}
