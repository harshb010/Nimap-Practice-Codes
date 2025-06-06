public class LongestWord {
    public static void main(String[] args) {
        String str = "Hellooooo Frommmmmmm Banga hello0=ooooooo";
        String longestWord = LongUsingChar(str);
        System.out.println(longestWord);

    }

   static String longestWord(String str) {
        String longWord = "";
        String word = "";
        for(int i=0;i<=str.length();i++)
        {
            if(i==str.length() || str.charAt(i)==' ')
            {
                if(longWord.length()<word.length())
                {
                    longWord = word;

                }
                word = "";

            }else {
                word = word + str.charAt(i);
            }
        }
        return longWord;
    }
static String LongUsingChar(String str)
{
    String[] stringArr = str.split(" ");
    String str1 = "";
    for(int i=0;i<stringArr.length;i++)
    {
        if(stringArr[i].length()>str1.length())
        {
            str1 = stringArr[i];
        }

    }
    return str1;
}


}
