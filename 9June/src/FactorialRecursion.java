public class FactorialRecursion {
    static int factorial(int num)
    {
        if(num == 0)
        {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        System.out.print(factorial(4));
    }
}