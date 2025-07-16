public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello World");
    }

    public void run1() {
        System.out.println("Hello run 1");
    }

    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        mt.run();
        mt.run1();
    }
}
