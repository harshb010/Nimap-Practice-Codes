public class MultipleCatch{
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[5] = 10;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error: " + e);
        } catch (Exception e) {
            System.out.println("General error: " + e);
        }
    }
}
