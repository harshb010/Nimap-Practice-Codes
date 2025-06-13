import java.util.Arrays;

public class LongestPalindrome {
    public static void main(String[] args) {
        String[] str = {"madam", "level", "java", "hello", "racecar"};
       String s =  Arrays.stream(str).filter(str1 -> str1.equals(new StringBuffer(str1).reverse().toString())).toList().getLast();
        System.out.println(s);
    }
}
