public class PrimeNumbers {
    public static void main(String[] args) {

        int n = 12;
        boolean b = true;

        for(int i = 2; i <= n / 2; i++) {
            if(n % i == 0) {
                b = false;
                break;
            }
        }
        if(b) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
