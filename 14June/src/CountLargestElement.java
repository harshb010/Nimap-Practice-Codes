public class CountLargestElement {
    public static void main(String[] args) {
        int[] arr = {2,1,1,1,3,4,4,1,1,1,1,1,6,7,7,7,7,7,7};

        int maxCount = 1;
        int currentCount = 1;
        int element = arr[0];
        int currentElement = arr[0];  // current element we are counting

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                currentCount++;
            } else {
                currentCount = 1;
                currentElement = arr[i];
            }

            if (currentCount > maxCount) {
                maxCount = currentCount;
                element = currentElement;
            }
        }
        System.out.println(element+" "+maxCount);
    }
}