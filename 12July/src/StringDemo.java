import java.util.*;

public class StringDemo {
    public static void main(String[] args) {
        String str = "Welcome to java tutorial";
        int end = str.length();
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ' || i == 0) {
                System.out.print(str.substring(i == 0 ? i : i + 1, end) + " ");
                end = i;
            }
        }
    }
}