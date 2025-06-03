import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Box");
        list.add("Milk");
        System.out.println(list);
        for(String items : list)
        {
            if(items.equals("Box"))
            {
                list.add("Bat");
            }
        }
        System.out.println(list);
    }
}
