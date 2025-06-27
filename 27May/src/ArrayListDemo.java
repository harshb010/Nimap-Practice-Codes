import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 5, 6, 4, 2, 5, 9, 23, 50, 9, 3);
        List<Integer> list1 = new ArrayList<>();
        Set<Integer> duplicate = new HashSet<>();
        for(int i : list)
        {
            if(!duplicate.contains(i))
            {
                duplicate.add(i);
            }else {
                list1.add(i);
            }
        }
        System.out.println(list1);

    }
}

// Expected output - 4, 5 , 9 ;