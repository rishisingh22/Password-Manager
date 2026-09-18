import java.util.Scanner;
import java.util.Base64;

public class PasswordService {

    static final String FILE_NAME = "passwords.txt";

    //  Add Password
    public static void addPassword(Scanner sc) {
        try {
            System.out.print("Enter Website: ");
            String site = sc.nextLine();

            System.out.print("Enter Username: ");
            String user = sc.nextLine();

            System.out.print("Enter Password: ");
            String pass = sc.nextLine();

            // Encrypt password
            String encrypted = Base64.getEncoder().encodeToString(pass.getBytes());

            FileHandler.writeToFile(site + "," + user + "," + encrypted);

            System.out.println("✅ Password Saved!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //  View Passwords
    public static void viewPasswords() {
        try {
            String[] lines = FileHandler.readFromFile();

            System.out.println("\n--- Saved Passwords ---");

            for (String line : lines) {
                if (line == null) continue;

                String[] data = line.split(",");

                String decrypted = new String(Base64.getDecoder().decode(data[2]));

                System.out.println("Website: " + data[0] +
                        " | Username: " + data[1] +
                        " | Password: " + decrypted);
            }

        } catch (Exception e) {
            System.out.println("No data found.");
        }
    }

    //  Delete Password
    public static void deletePassword(Scanner sc) {
        try {
            System.out.print("Enter website to delete: ");
            String siteToDelete = sc.nextLine();

            boolean result = FileHandler.deleteFromFile(siteToDelete);

            if (result)
                System.out.println(" Deleted successfully!");
            else
                System.out.println(" Not found!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}