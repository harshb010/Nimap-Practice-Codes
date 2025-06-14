public class CharFrequency {
    public static void main(String[] args) {
        String input = "hello world";

        int[] freq = new int[26];

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
           if(c >= 'a' && c<='z')
           {
               freq[c - 'a']++;
           }
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println((char) (i + 'a')+": " + freq[i]);
            }
        }
    }
}
