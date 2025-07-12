import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "geeks";
        String s2 = "kseegs";

        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();

        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
        boolean b = Arrays.equals(s1Array, s2Array);

        System.out.println(b ? "Anagram" : "no");
    }
}