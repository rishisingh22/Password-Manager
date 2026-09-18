import java.io.*;

public class FileHandler {

    static final String FILE_NAME = "data/passwords.txt";

    // Write
    public static void writeToFile(String data) throws IOException {
        FileWriter fw = new FileWriter(FILE_NAME, true);
        fw.write(data + "\n");
        fw.close();
    }

    // Read
    public static String[] readFromFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));

        String[] lines = new String[100];
        String line;
        int i = 0;

        while ((line = br.readLine()) != null) {
            lines[i++] = line;
        }

        br.close();
        return lines;
    }

    // Delete
    public static boolean deleteFromFile(String siteToDelete) throws IOException {

        File inputFile = new File(FILE_NAME);
        File tempFile = new File("temp.txt");

        BufferedReader br = new BufferedReader(new FileReader(inputFile));
        BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile));

        String line;
        boolean found = false;

        while ((line = br.readLine()) != null) {
            if (!line.startsWith(siteToDelete + ",")) {
                bw.write(line + "\n");
            } else {
                found = true;
            }
        }

        br.close();
        bw.close();

        inputFile.delete();
        tempFile.renameTo(inputFile);

        return found;
    }
}