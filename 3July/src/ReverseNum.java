public class ReverseNum {
    public static void main(String[] args) {
        int num = 23907;
        int x = 0;
        while(num>0)
        {
            int rem = num % 10;
            x = x * 10 + rem;
            num = num/10;
        }
        System.out.println(x);
    }
}
