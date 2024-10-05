import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner welcome = new Scanner(System.in);
        String commandPrompt;

        System.out.println("Welcome to the One Stop Centre! Please choose an option:");
        System.out.println("1. 'Todo'  - for todo app");
        System.out.println("2. 'Unique' - for storing a unique username");
        System.out.println("3. 'Phone'  - for phonebook");
        System.out.println("4. 'Exit'   - to exit the application");

        while (true) {
            System.out.print("\nEnter command: ");
            commandPrompt = welcome.nextLine();

            if (commandPrompt.equalsIgnoreCase("Todo")) {
                // TODO LIST APP
                ToDoList todoList = new ToDoList();
                String command;
                System.out.println("Welcome to your To-Do List! Enter 'add', 'remove', 'list', or 'exit':");

                while (true) {
                    System.out.print("\nEnter command: ");
                    command = welcome.nextLine();

                    if (command.equalsIgnoreCase("add")) {
                        System.out.print("Enter task name: ");
                        String taskName = welcome.nextLine();
                        todoList.addItemToToDoList(taskName);
                    } else if (command.equalsIgnoreCase("remove")) {
                        System.out.print("Enter task name to remove: ");
                        String taskName = welcome.nextLine();
                        todoList.removeToDoItemFromList(taskName);
                    } else if (command.equalsIgnoreCase("list")) {
                        todoList.printTasks();
                    } else if (command.equalsIgnoreCase("exit")) {
                        System.out.println("Exiting the to-do list. Goodbye!");
                        break;
                    } else {
                        System.out.println("Invalid command. Please enter 'add', 'remove', 'list', or 'exit'.");
                    }
                }
            } else if (commandPrompt.equalsIgnoreCase("Unique")) {
                UniqueUsername uniqueUsername = new UniqueUsername();
                String usernameCommand;
                System.out.println("Welcome to the Unique Username manager! Enter 'add' to add a username, 'list' to view all usernames, or 'exit' to go back to the main menu:");

                while (true) {
                    System.out.print("\nEnter command: ");
                    usernameCommand = welcome.nextLine();

                    if (usernameCommand.equalsIgnoreCase("add")) {
                        System.out.print("Enter username: ");
                        String username = welcome.nextLine();
                        uniqueUsername.storeListOfUniqueUsernames(username);
                    } else if (usernameCommand.equalsIgnoreCase("list")) {
                        uniqueUsername.printUniqueUsernames();
                    } else if (usernameCommand.equalsIgnoreCase("exit")) {
                        System.out.println("Exiting the unique username manager. Returning to main menu.");
                        break;
                    } else {
                        System.out.println("Invalid command. Please enter 'add', 'list', or 'exit'.");
                    }
                }

            } else if (commandPrompt.equalsIgnoreCase("Phone")) {
                PhoneBook phoneBook = new PhoneBook();
                String phoneCommand;
                System.out.println("Welcome to the Phone Book! Enter 'add', 'retrieve', 'list', or 'exit':");

                while (true) {
                    System.out.print("\nEnter command: ");
                    phoneCommand = welcome.nextLine();

                    if (phoneCommand.equalsIgnoreCase("add")) {
                        System.out.print("Enter name: ");
                        String name = welcome.nextLine();
                        System.out.print("Enter phone number: ");
                        String number = welcome.nextLine();
                        phoneBook.store(name, number);
                    } else if (phoneCommand.equalsIgnoreCase("retrieve")) {
                        System.out.print("Enter name to retrieve the phone number: ");
                        String name = welcome.nextLine();
                        String phoneNumber = phoneBook.retrieve(name);
                        if (phoneNumber != null) {
                            System.out.println("Phone number for " + name + ": " + phoneNumber);
                        }
                    } else if (phoneCommand.equalsIgnoreCase("list")) {
                        phoneBook.displayAllContacts();
                    } else if (phoneCommand.equalsIgnoreCase("exit")) {
                        System.out.println("Exiting the phone book. Returning to main menu.");
                        break;
                    } else {
                        System.out.println("Invalid command. Please enter 'add', 'retrieve', 'list', or 'exit'.");
                    }
                }

            } else if (commandPrompt.equalsIgnoreCase("Exit")) {
                // Exit the main loop and terminate the program
                System.out.println("Exiting the application. Goodbye!");
                break;
            } else {
                System.out.println("Invalid command. Please enter 'Todo', 'Unique', 'Phone', or 'Exit'.");
            }
        }

        welcome.close();
    }
}
