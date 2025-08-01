public class StringReverse {
    public static void main(String[] args) {

        String str = "Java is Powerful";
        String revStr = "";
        String reversed = "";
        String x = "";
        int count = 0;
        for(int i=0;i<=str.length();i++)
        {
            if(i == str.length() || str.charAt(i)==' ')
            {
                revStr = str.substring(count, i);
               reversed = new StringBuilder(revStr).reverse().toString();
                x = x + reversed+" ";
               count = i+1;
               revStr = "";
            }
        }
        System.out.println(x);
    }
}


