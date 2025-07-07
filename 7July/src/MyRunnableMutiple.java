class MyRunnableMultiple implements Runnable {
    private String name;

    MyRunnableMultiple(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(name + " running: " + i);
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnableMultiple("Thread 1"));
        Thread t2 = new Thread(new MyRunnableMultiple("Thread 2"));

        t1.start();
        t2.start();
    }
}
