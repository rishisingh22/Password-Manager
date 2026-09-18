import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Master Password: ");
        String master = sc.nextLine();

        if (!master.equals("admin123")) {
            System.out.println(" Wrong Password!");
            return;
        }

        System.out.println(" Login Successful!");

        int choice;

        do {
            System.out.println("\n===== PASSWORD MANAGER =====");
            System.out.println("1. Add Password");
            System.out.println("2. View Passwords");
            System.out.println("3. Delete Password");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    PasswordService.addPassword(sc);
                    break;

                case 2:
                    PasswordService.viewPasswords();
                    break;

                case 3:
                    PasswordService.deletePassword(sc);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);
    }
}