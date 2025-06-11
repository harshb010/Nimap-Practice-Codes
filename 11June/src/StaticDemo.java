public class StaticDemo {

    static int k = 30;
    static int i = 10;
    static{
        Hello();
    }
    static void Hello()
    {
        System.out.println("Hello : "+i+" "+j+" "+k);
    }

    public static void main(String[] args) {

        System.out.println("Hello : "+i+" "+j+" "+k);
    }
    static int j= 20;
}
