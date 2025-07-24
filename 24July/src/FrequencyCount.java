public class FrequencyCount {
    public static void main(String[] args) {
        String str = "Hhelloworld";
        int[] freq = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
           if(ch >='a' && ch <= 'z')
           {
               freq[ch - 'a']++;
           }
        }


        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char)(i+'a')+" "+freq[i]);
            }
        }
    }
}
