public class Demo1 {
    public static void main(String[] args) {
        String str = "00010110";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            sum += (str.charAt(i) == '0') ? 1 : 2;
        }

        System.out.println(sum);
    }
}