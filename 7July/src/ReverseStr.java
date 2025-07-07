public class ReverseStr{
    public static void main(String[] args) {
        String str = "Java is Powerfull";

        int count  = 0;
        String revStr = "";
        String x ="";
        for(int i=0;i<=str.length();i++)
        {
            if(i==str.length() || str.charAt(i)==' ')
            {
              revStr = revStr + str.substring(count, i);
                count = i+1;
                    x += reverseString(revStr);
               // System.out.println(revStr);
                revStr = "";
            }
        }
        System.out.println(x);

    }

    static String reverseString(String word)
    {
        String revWord = "";
        for(int k=0;k<word.length();k++)
        {
            revWord = word.charAt(k)+revWord;
        }
        return revWord+" ";
    }

}
