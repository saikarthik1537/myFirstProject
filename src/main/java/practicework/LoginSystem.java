package practicework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoginSystem {
    private Map<String, String> userDatabase;

    public LoginSystem() {
        this.userDatabase = new HashMap<>();
    }

    public static void main(String[] args) {
        LoginSystem loginSystem = new LoginSystem();
        loginSystem.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Login");
            System.out.println("2. Create Account");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    login(scanner);
                    break;
                case 2:
                    createAccount(scanner);
                    break;
                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void login(Scanner scanner) {
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (userDatabase.containsKey(username) && userDatabase.get(username).equals(password)) {
            System.out.println("Login successful!");
            welcomePage(username);
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
    }

    private void createAccount(Scanner scanner) {
        System.out.print("Enter a new username: ");
        String newUsername = scanner.nextLine();

        if (userDatabase.containsKey(newUsername)) {
            System.out.println("Username already exists. Please choose a different username.");
            return;
        }

        System.out.print("Enter a password: ");
        String newPassword = scanner.nextLine();

        userDatabase.put(newUsername, newPassword);
        System.out.println("Account created successfully!");
    }

    private void welcomePage(String username) {
        System.out.println("Welcome, " + username + "!");
        // Add additional welcome page functionality or redirect to another page as needed.
    }
}

