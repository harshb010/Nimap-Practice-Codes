public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 1, 2, 2, 3, 5, 5, 5, 5, 5, 5, 5, 5};
        int maxCount = 0, mostFrequentNum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mostFrequentNum = arr[i];
            }
        }

        System.out.println(mostFrequentNum + " appears " + maxCount + " times.");
    }
}
