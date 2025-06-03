import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class IntegerComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}

public class CollectorsDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(9);
        list.add(3);
        list.add(20);
        list.sort(new IntegerComparator());
        System.out.println(list);

        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Pineapple");
        stringList.add("Box");
        stringList.sort((a, b) -> b.length() - a.length());
        System.out.println(stringList);
    }
}
