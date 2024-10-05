import java.util.HashMap;
import java.util.Map;

/**
 * Create a phone book using a HashMap to store names as keys and phone numbers as values.
 * <p>
 * Ensure it supports adding and retrieving contacts efficiently.
 */
public class PhoneBook {
    Map<String, String> map = new HashMap<>();

    public void store(String name, String number) {
        if (name == null || number == null) {
            System.out.println("Name or number cannot be null!");
        } else if (map.containsKey(name)) {
            System.out.println("The name \"" + name + "\" already exists in the phone book.");
        } else if (map.containsValue(number)) {
            System.out.println("The phone number \"" + number + "\" is already associated with another contact.");
        } else {
            map.put(name, number);
            System.out.println("Contact \"" + name + "\" with phone number \"" + number + "\" has been added.");
        }
    }

    public String retrieve(String name) {
        if (name != null && map.containsKey(name)) {
            return map.get(name);
        } else {
            System.out.println("The contact \"" + name + "\" was not found.");
            return null;
        }
    }

    // Method to display all contacts (for convenience)
    public void displayAllContacts() {
        if (map.isEmpty()) {
            System.out.println("Phone book is empty.");
        } else {
            System.out.println("Phone Book Contacts:");
            for (Map.Entry<String, String> entry : map.entrySet()) {
                System.out.println("Name: " + entry.getKey() + ", Phone Number: " + entry.getValue());
            }
        }
    }
}
