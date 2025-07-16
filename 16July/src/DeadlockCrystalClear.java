class Resource {
    String name;
    Resource(String name) {
        this.name = name;
    }
}

class Task implements Runnable {
    private Resource r1;
    private Resource r2;

    Task(Resource r1, Resource r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();

        System.out.println(threadName + " trying to lock " + r1.name);
        synchronized (r1) {
            System.out.println(threadName + " locked " + r1.name);

            try { Thread.sleep(100); } catch (InterruptedException e) {}

            System.out.println(threadName + " trying to lock " + r2.name);
            synchronized (r2) {
                System.out.println(threadName + " locked " + r2.name);
                System.out.println(threadName + " doing work...");
            }
        }
    }
}

public class DeadlockCrystalClear {
    public static void main(String[] args) {
        Resource pen = new Resource("PEN");
        Resource paper = new Resource("PAPER");

        Task t1 = new Task(pen, paper);  // A: pen -> paper
        Task t2 = new Task(paper, pen);  // B: paper -> pen

        Thread thread1 = new Thread(t1, "Thread-A");
        Thread thread2 = new Thread(t2, "Thread-B");

        thread1.start();
        thread2.start();
    }
}
