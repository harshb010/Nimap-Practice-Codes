import java.util.ArrayList;
import java.util.List;

public class ArraylistDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(100);
       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);
       list.addAll(list);
        System.out.println(list );
    }
}
