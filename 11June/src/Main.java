//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String str = "Hello";
        StringBuilder str1 = new StringBuilder("Hello");
        StringBuffer str2 = new StringBuffer("Hello");

        System.out.println(str.equals(new StringBuilder("Hello").toString()));
        System.out.println(str.equals(str2));
        System.out.println(str1.equals(str2));
    }
}