public class Hello {
    public static void main(String[] args) {
        World world = new World();
        Thread th = new Thread(world);
        th.start();
        for( ; ; )
        {
            System.out.println("Hello");
        }
    }
}
