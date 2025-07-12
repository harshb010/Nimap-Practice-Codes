import java.util.*;
import java.util.stream.Collectors;

class User {
    String country;
    public User(String country) { this.country = country; }
    public String getCountry() { return country; }
}

public class Main1 {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User("India"), new User("USA"), new User("India")
        );

        Map<String, Long> countryCount = users.stream()
                .collect(Collectors.groupingBy(User::getCountry, Collectors.counting()));

        System.out.println(countryCount); // {India=2, USA=1}
    }
}
