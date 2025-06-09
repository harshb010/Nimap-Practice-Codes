class ReversedWord {
    public static void main(String[] args) {
        String str = "India is my Country";
        String revStr = "";
        int count = 0;
        for(int i=0;i<=str.length();i++)
        {
            if(i == str.length() || str.charAt(i)==' ')
            {
                for(int j = i-1;j>=count;j--)
                {
                    revStr = revStr + str.charAt(j);
                }
                if(i != str.length())
                {
                    revStr += " ";
                }
                count = i+1;
            }
        }
        System.out.println(revStr);
    }
}