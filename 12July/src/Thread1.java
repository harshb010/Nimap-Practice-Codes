class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}

public class Thread1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); // runs in new thread

        System.out.println("Main thread: " + Thread.currentThread().getName());
    }
}
