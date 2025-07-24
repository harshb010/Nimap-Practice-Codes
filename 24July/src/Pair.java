public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void printPair() {
        System.out.println("Key: " + key + ", Value: " + value);
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(1, "One");
        pair.printPair();
    }
}
