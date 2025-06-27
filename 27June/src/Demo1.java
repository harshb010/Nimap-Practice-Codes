import java.util.Optional;

class User {
    private String name;
    private Optional<String> email;

    public User(String name, Optional<String> email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getEmail() {
        return email;
    }
}

public class Demo1 {
    public static void main(String[] args) {
        User userWithEmail = new User("Harshal", Optional.of("harshal@example.com"));
        User userWithoutEmail = new User("Bhavesh", Optional.empty());

        printEmail(userWithEmail);
        printEmail(userWithoutEmail);
    }

    static void printEmail(User user) {
        System.out.println("User: " + user.getName());
        user.getEmail().ifPresentOrElse(
                email -> System.out.println("Email: " + email),
                () -> System.out.println("No email provided.")
        );
    }
}
