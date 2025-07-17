public class ReentrantMain {
    public static void main(String[] args) {
        ReentrantExample reentrantExample = new ReentrantExample();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                reentrantExample.OuterMethod();
            }
        };
//
        Thread t1 = new Thread(runnable);
  //      Thread t2 = new Thread(runnable);
//
        t1.start();
   //     t2.start();
      reentrantExample.InnerMethod();
    }
}
