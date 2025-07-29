public class ExceptionDemo {
    public static void main(String[] args) {
        int x = 10;
        try{
            System.out.println("Yes");
            System.out.println("Yes");
            int y = x/0;
            System.out.println("Hello");


        } catch (Exception e) {
            System.out.println("World");

            System.out.println(e);
            System.out.println("World");


        }finally {
            System.out.println("Okay");
        }
    }
}
