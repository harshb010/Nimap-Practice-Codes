import java.util.ArrayList;
import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String > hash = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        hash.put(1,"Harshal");
        hash.put(2,"Bhavesh");
        hash.put(3,"Kunal");
        System.out.println(hash.get(2));
        System.out.println(list.get(2));
    }
}
