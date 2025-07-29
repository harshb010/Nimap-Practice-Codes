public class ThreadDemo extends Thread{

    ThreadDemo(String str)
    {
        super(str);
    }
    @Override
    public void run() {
       for(int i=0;i<5;i++)
       {
           try {
               Thread.sleep(1000);

           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
           System.out.println(i);
           System.out.println(currentThread().getName());
       }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadDemo td = new ThreadDemo("main");
        td.start();
     //   td.join();
        System.out.println(currentThread().getName());
    }
}
