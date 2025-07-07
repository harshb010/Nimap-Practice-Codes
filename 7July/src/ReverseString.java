public class ReverseString {
    public static void main(String[] args) {
        String str = "Java is Powerful";
        String revStr = "";
        int count = 0;
        for(int i=0;i<=str.length();i++)
        {
            if(i == str.length() || str.charAt(i)==' ')
            {
                for(int j=i-1;j>=count;j--)
                {
                    revStr = revStr+str.charAt(j);
                }
                count = i+1;
                if(i != str.length())
                {
                    revStr += " ";
                }
            }
        }
        System.out.println(revStr);
    }
}


