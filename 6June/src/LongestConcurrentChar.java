public class LongestConcurrentChar {
    public static void main(String[] args) {
        String str = "Heeeelllooo";

        char maxChar = str.charAt(0);   // Character with longest run
        int maxCount = 1;               // Length of that run

        char currentChar = str.charAt(0);
        int currentCount = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentChar) {
                currentCount++;
            } else {
                currentChar = str.charAt(i);
                currentCount = 1;
            }

            if (currentCount > maxCount) {
                maxCount = currentCount;
                maxChar = currentChar;
            }
        }

        System.out.println("Character: " + maxChar);
        System.out.println("Count: " + maxCount);
    }
}
