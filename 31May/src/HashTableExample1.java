import java.util.Hashtable;

public class HashTableExample1 {
    public static void main(String[] args) {

        Hashtable<Integer, String> table = new Hashtable<>();

        table.put(1, "Java");
        table.put(2, "Python");
        table.put(3, "C++");

        System.out.println("Hashtable contents: " + table);

        System.out.println("Value at key 2: " + table.get(2));

        System.out.println("Contains key 3? " + table.containsKey(3));

        System.out.println("Contains value 'Java'? " + table.contains("Java"));

        table.remove(1);
        System.out.println("After removing key 1: " + table);
    }
}
