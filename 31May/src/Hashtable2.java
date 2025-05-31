import java.util.Hashtable;

public class Hashtable2 {
    public static void main(String[] args) {

        Hashtable<String, String> capitalCities = new Hashtable<>();

        capitalCities.put("India", "New Delhi");
        capitalCities.put("USA", "Washington D.C.");
        capitalCities.put("UK", "London");


        for (String country : capitalCities.keySet()) {
            System.out.println("Capital of " + country + ": " + capitalCities.get(country));
        }
    }
}
