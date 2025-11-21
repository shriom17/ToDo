import java.util.ArrayList;
import java.util.Scanner;

public class ToDo {

    // Data structure to store tasks
    static ArrayList<String> tasks = new ArrayList<>();

    // Method to add a task
    public static void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added successfully!");
    }

    // Method to delete a task
    public static void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Task deleted successfully!");
        } else {
            System.out.println("Invalid task number!");
        }
    }

    // Method to mark a task as complete
    public static void markComplete(int index) {
        if (index >= 0 && index < tasks.size()) {
            String updated = tasks.get(index) + " ✔ (Completed)";
            tasks.set(index, updated);
            System.out.println("Task marked as complete!");
        } else {
            System.out.println("Invalid task number!");
        }
    }

    // Method to display tasks
    public static void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks added yet!");
        } else {
            System.out.println("\nYour To-Do List:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Menu
            System.out.println("\n=== To-Do List Menu ===");
            System.out.println("1. Add Task");
            System.out.println("2. Delete Task");
            System.out.println("3. Mark Task as Complete");
            System.out.println("4. Display Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    String task = sc.nextLine();
                    addTask(task);
                    break;

                case 2:
                    displayTasks();
                    System.out.print("Enter task number to delete: ");
                    int del = sc.nextInt() - 1;
                    deleteTask(del);
                    break;

                case 3:
                    displayTasks();
                    System.out.print("Enter task number to mark complete: ");
                    int comp = sc.nextInt() - 1;
                    markComplete(comp);
                    break;

                case 4:
                    displayTasks();
                    break;

                case 5:
                    System.out.println("Exiting... Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
