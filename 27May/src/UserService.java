import java.util.HashMap;
import java.util.Map;

public class UserService {
    private Map<String, String> users = new HashMap<>();

    public UserService() {
        users.put("john", "John Doe");
        users.put("jane", "Jane Smith");
    }

    public String getUserByUsername(String username) throws UserNotFoundException {
        if (!users.containsKey(username)) {
            throw new UserNotFoundException("User '" + username + "' not found.");
        }
        System.out.println(users.get(username));
        return users.get(username);
    }

    public static void main(String[] args) {
        UserService userService = new UserService();
        try {
            String user = userService.getUserByUsername("jane");
            System.out.println("Found user: " + user);
        } catch (UserNotFoundException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
