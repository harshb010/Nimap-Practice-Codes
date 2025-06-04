import java.util.*;
public class Main{

    static List<List<String>> groupAnagrams(String[] input)
    {
        Map<String, List<String>> anagramList = new HashMap<>();

        for(String word : input)
        {
            char[] wordChar = word.toCharArray();
            Arrays.sort(wordChar);
            String sortedWord = new String(wordChar);
            System.out.println(sortedWord);
            if(!anagramList.containsKey(sortedWord))
            {
                anagramList.put(sortedWord, new ArrayList<>());
            }


            anagramList.get(sortedWord).add(word);
            System.out.println(anagramList.get(sortedWord));

        }
        return new ArrayList<>(anagramList.values());
    }

    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(input);
        System.out.println(result);
    }
}