import java.util.Arrays;

public class ZeroAtEnd {
    public static void main(String[] args) {
        int[] arr = {5,2,0,7,9,0,4,0,3,4,0};
        int n = arr.length;
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }
        while (index < n) {
            arr[index++] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}