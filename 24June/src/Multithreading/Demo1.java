package Multithreading;

public class Demo1 extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Demo1 demo = new Demo1();
        System.out.println(demo.getState());
      //  System.out.println("Main : "+ Thread.currentThread().getState());
        demo.start();
        System.out.println(demo.getState());
        Thread.sleep(2000);
      //  System.out.println("Main : "+ Thread.currentThread().getState());
        System.out.println(demo.getState());
        demo.join();
        System.out.println(demo.getState());

    }
}
