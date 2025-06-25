class MyTask extends Thread {
    public void run() {
        try {
            Thread.sleep(1000); // Goes to timed waiting
            System.out.println("Task executed");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyTask t1 = new MyTask();
        t1.start();
        t1.join(); // Main thread waits for t1 to finish
        System.out.println("Main thread finishes after t1");
    }
}
