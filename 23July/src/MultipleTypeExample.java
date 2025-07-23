class Pair<K, V> {

    private K key;
     private V value;
     Pair(K key, V value)
     {
         this.key = key;
         this.value = value;
     }
     K getKey()
     {
         return key;
     }
     V getValue()
     {
         return value;
     }
}

public class MultipleTypeExample {
    public static void main(String[] args) {
        Pair<Integer, String> student = new Pair<>(10,"Harshal");
        System.out.println(student.getKey()+" "+student.getValue());
    }
}
