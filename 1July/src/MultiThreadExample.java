class Task1 extends Thread {
    public void run() {
        System.out.println("Task1 started");
        for (int i = 0; i < 5; i++) {
            System.out.println("Task1: " + i);
        }
        System.out.println("Task1 finished");
    }
}

class Task2 extends Thread {
    public void run() {
        System.out.println("Task2 started");
        for (int i = 0; i < 5; i++) {
            System.out.println("Task2: " + i);
        }
        System.out.println("Task2 finished");
    }
}

public class MultiThreadExample {
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();

        t1.start();
        t2.start();
    }
}
