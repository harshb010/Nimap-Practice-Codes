public class SquareRoot {
    public static void main(String[] args) {
        int number = 16;
        int sqrt = 0;

        for (int i = 1; i <= number; i++) {
            if (i * i == number) {
                sqrt = i;
                break;
            } else if (i * i > number) {
                sqrt = i - 1;
                break;
            }
        }

        System.out.println("Square root of " + number + " is approximately: " + sqrt);
    }
}
