import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;

    private Lock lock = new ReentrantLock();

    public void withdraw(int amount) throws InterruptedException {

        try{
            if(lock.tryLock(2000, TimeUnit.MILLISECONDS))
            {
                if(balance >= amount)
                {
                    try{
                        System.out.println(Thread.currentThread().getName()+"Started Withrawal....");
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName()+" Successful withdraw.. "+balance);

                    }catch(Exception e){
                }finally{
                        lock.unlock();
                }
                  }else {
                    System.out.println(Thread.currentThread().getName()+"Unsufficient Balance");

                }
            }else {
                System.out.println("I waited for 3 sec but no response");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }

}
