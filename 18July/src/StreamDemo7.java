import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public class StreamDemo7 {
    public static void main(String[] args) {
        List<Integer> list = List.of(12,10,20,22,25,30,35,35,21,20,8);
        List<Integer> list1 = list.stream().filter(x -> x % 5 == 0).toList();
        System.out.println(list1);
    }
}
