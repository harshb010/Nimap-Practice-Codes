public class ThreadDemo extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task: " + i);
            try {
                Thread.sleep(1000); // Pause 1 sec
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo();
        t1.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main: " + i);
            try {
                Thread.sleep(500); // Pause 0.5 sec
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
