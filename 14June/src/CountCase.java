
public class CountCase {
    public static void main(String[] args) {
        String input = "Hello world!";
        int uppercase = 0;
        int lowercase = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)){
                uppercase++;
            } else if (Character.isLowerCase(ch)) {
                lowercase++;
            }
        }

        System.out.println("Uppercase = " + uppercase);
        System.out.println("Lowercase = " + lowercase);
    }
}