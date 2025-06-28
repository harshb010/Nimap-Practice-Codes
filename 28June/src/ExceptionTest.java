public class ExceptionTest{
    public static int testMethod() {
        try {
            System.out.println("Inside try");
            return 1;
        } finally {
            System.out.println("Inside finally");
        }
    }

    public static void main(String[] args) {
        System.out.println("Returned: " + testMethod());
    }
}
