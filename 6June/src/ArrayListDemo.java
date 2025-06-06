import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(10);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        List<Integer> list2 = List.of(5,6,7,8,9);
        list.addAll(list2);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.sort(null);

    }
}
