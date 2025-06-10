public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = {4, 5, 4, 6, 7, 5, 8};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;


            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    isDuplicate = false;
                    break;
                }
            }

            if (isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
