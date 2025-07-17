import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample {
//    private final Lock lock = new ReentrantLock();

    public synchronized void OuterMethod()
    {

        try{
            System.out.println("Outer Method");
            Thread.sleep(2000);
            InnerMethod();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally{

        }
    }

    public synchronized void InnerMethod()
    {

        try{
            Thread.sleep(5000);
            System.out.println("Inner Method");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally{
        }
    }
}
