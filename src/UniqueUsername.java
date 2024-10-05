import java.util.HashSet;
import java.util.Set;

public class UniqueUsername {
    Set<String> stringSet = new HashSet<>();

    // Method to store unique usernames
    public void storeListOfUniqueUsernames(String username) {
        if (username != null) {
            if (stringSet.contains(username)) {
                System.out.println("Username '" + username + "' already exists!");
            } else {
                stringSet.add(username);
                System.out.println("Username '" + username + "' added successfully.");
            }
        } else {
            System.out.println("Username cannot be null.");
        }
    }

    // Method to print all unique usernames
    public void printUniqueUsernames() {
        if (stringSet.isEmpty()) {
            System.out.println("No usernames stored.");
        } else {
            System.out.println("Unique usernames:");
            for (String username : stringSet) {
                System.out.println("- " + username);
            }
        }
    }
}
