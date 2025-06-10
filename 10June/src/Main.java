public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 5, 4, 6, 7, 5, 8};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean isDistinct = true;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDistinct = false;
                    break;
                }
            }

            if (isDistinct) {
                System.out.print(arr[i] + " ");
            }
        }
    }
} 