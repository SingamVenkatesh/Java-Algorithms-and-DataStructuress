package RecursionProblemssSynopisPreparation.FileHandling;

import java.io.File;

public class CreateFileExample {
    public static void main(String[] args) {
        try {
            File file = new File("crickerters.txt");

            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
