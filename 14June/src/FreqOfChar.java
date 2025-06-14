public class FreqOfChar {
    public static void main(String[] args) {
        String input = "hello world";

        int[] freq = new int[26];

        // Count frequency of each character
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            freq[(int) c]++;
        }

        // Print characters and their frequencies
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + ": " + freq[i]);
            }
        }
    }
}
