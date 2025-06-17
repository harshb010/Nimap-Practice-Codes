class Utility {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

public class GenericMethodExample {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4};
        String[] strArray = {"A", "B", "C"};


        Utility.printArray(intArray);  // Outputs: 1 2 3 4
        Utility.printArray(strArray);  // Outputs: A B C
    }
}
