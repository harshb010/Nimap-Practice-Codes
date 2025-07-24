import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoMain {

    public static void main(String[] args) {
        List<Address> address1 = List.of(new Address(1),new Address(2),new Address(4));
        List<Address> address2 = List.of(new Address(2),new Address(3));
        List<Address> address3 = List.of(new Address(4));
        List<Address> address4 = List.of(new Address(2),new Address(4));

       int targetAddressId = 2;

        List<User> user = List.of(new User(1,"Harshal",address1),new User(2,"Hars",address2),new User(3,"Harsh",address3),new User(4,"Haa",address4));
        List<User> usersWithAddress = user.stream()
                .flatMap(u -> u.getAddressList().stream()
                        .filter(addr -> addr.getId() == 2)
                        .map(addr -> u)) // Map back to user if address matches
                .distinct() // Optional: remove duplicates if a user has multiple matching addresses
                .toList();


        System.out.println(usersWithAddress);

    }



}
