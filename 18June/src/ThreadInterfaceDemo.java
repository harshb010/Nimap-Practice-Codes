class WorldDemo implements Runnable{

    @Override
    public void run() {
        for( ; ; )
        {
            System.out.println("World");
        }
    }
}
public class ThreadInterfaceDemo {
    public static void main(String[] args) {

        World world = new World();
        Thread t1 = new Thread(world);
        t1.start();
        t1.getState()

        for( ; ; )
        {
            System.out.println("Hello");
        }
    }
}
