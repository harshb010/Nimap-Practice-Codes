import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(11,0.5f,true);
        linkedHashMap.put("Apple", 10);
        linkedHashMap.put("Grapes", 30);
        linkedHashMap.put("Banana", 6);

        linkedHashMap.get("Grapes");
        linkedHashMap.get("Grapes");

        linkedHashMap.get("Banana");
        linkedHashMap.get("Apple");
        linkedHashMap.get("Apple");
        linkedHashMap.get("Grapes");

        for(Map.Entry<String, Integer> entry : linkedHashMap.entrySet())
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
