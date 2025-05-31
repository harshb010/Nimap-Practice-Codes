import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put(null, "NullKeyAllowed");
        map.put("Key1", null);
        map.put("Key2", null);

        System.out.println("HashMap with nulls: " + map);
    }
}
