class World extends Thread
{
    @Override
    public void run() {
        for( ; ; )
        {
            System.out.println("World");
        }
    }
}


public class ThreadClassDemo {
    public static void main(String[] args) {

        World world = new World();
        world.start();

        for( ; ; )
        {
            System.out.println("Hello");
        }
    }
}
