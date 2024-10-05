import java.util.ArrayList;
import java.util.List;

/**
 * Create a simple to-do list using an ArrayList that:
 * <p>
 * Adds tasks.
 * Removes tasks by name.
 * Prevents duplicate tasks.
 *
 * <p>
 */
public class ToDoList {
    private final List<String> todoList = new ArrayList<>();

    public ToDoList(){}

    public void addItemToToDoList(String taskName) {
        if (taskName != null && !todoList.contains(taskName)) {
            todoList.add(taskName);
            System.out.println("task " + taskName + " has been added!");
        } else {
            System.out.println("Task \"" + taskName + "\" already exists.");
        }
    }

    public void removeToDoItemFromList(String taskName) {
        if (todoList.remove(taskName)) {
            System.out.println("Task \"" + taskName + "\" has been removed.");
        } else {
            System.out.println("Task \"" + taskName + "\" not found.");
        }
    }

    public void printTasks() {
        if (todoList.isEmpty()) {
            System.out.println("Your to-do list is empty.");
        } else {
            System.out.println("Your tasks:");
            for (int i = 0; i < todoList.size(); i++) {
                System.out.println((i + 1) + ". " + todoList.get(i));
            }
        }
    }
}
