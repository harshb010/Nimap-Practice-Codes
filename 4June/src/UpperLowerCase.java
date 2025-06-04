public class UpperLowerCase {
    public static void main(String[] args) {
        String input = "Hello world!";
        int uppercaseCount = 0, lowercaseCount = 0;

        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            }
        }

        System.out.println("Uppercase = " + uppercaseCount + ", Lowercase = " + lowercaseCount);
    }
}
