
public class CountElementLargest {
    public static void main(String[] args) {
        int[] arr = {2,1,1,1,3,4,4,1,1,1,1,1,6,7,7,7,7,7};

        int maxCount = 0, currentCount = 1, longestElement = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                currentCount++;
            } else {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    longestElement = arr[i - 1];
                }
                currentCount = 1;
            }
        }

        if (currentCount > maxCount) {
            maxCount = currentCount;
            longestElement = arr[arr.length - 1];
        }

        System.out.println(longestElement+" "+maxCount);
    }
}
