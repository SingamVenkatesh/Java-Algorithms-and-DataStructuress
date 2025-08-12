package RecursionProblemssSynopisPreparation.FileHandling;

import java.io.File;
import java.util.Scanner;
public class ReadingUsingScannerclass {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("example.txt"));
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
                System.out.println("Java Version: " + System.getProperty("java.version"));
            }
            sc.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
