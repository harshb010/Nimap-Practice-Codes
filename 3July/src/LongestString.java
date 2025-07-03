import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LongestString {

    public static void main(String[] args) {
        List<String> list = List.of("apple","ball","cat","elephant","Hello");
//        String maxString = list.stream().max(Comparator.comparing(String::length));
//        System.out.println(maxString);

//        int length=0;
//        String x = "";
//        for(int i=0;i< list.size();i++)
//        {
//            String str = list.get(i);
//            if(str.length()>length)
//            {
//              x = str;
//              length = str.length();
//            }
//
//        }
//        System.out.println(x);


        int length = 0;
        String longestString = "";
        for(String str : list)
        {
            if(str.length()>length)
            {
                longestString = str;
                length = str.length();
            }
        }

        System.out.println(longestString+" "+length);

    }
}
