public class GenericMehtodExample {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3};
        String[] strArr = {"A", "B", "C"};

        System.out.print("Integer Array: ");
        printArray(intArr);

        System.out.print("String Array: ");
        printArray(strArr);
    }
}
