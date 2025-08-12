package RecursionProblemssSynopisPreparation.FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteIntoFile {
    public static void main(String[] args)
    {

        try {

          //  FileWriter writer = new FileWriter("example.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt"));
            writer.write("Rohit Sharma");
            writer.newLine();
            writer.write("Shikar Dhawan");
            writer.newLine();
            writer.write("Virat Kohli");
            writer.newLine();
            writer.write("Shreyas Iyer");
            writer.newLine();
            writer.write("Rishab Pant");
            writer.newLine();
            writer.write("KL Rahul");
            writer.newLine();
            writer.write("Axar Patel");
            writer.newLine();
            writer.write("Ravindra Jadeja");
            writer.newLine();
            writer.write("Kuldeep yadav");
            writer.newLine();
            writer.write("Mohamood Siraj");
            writer.newLine();
            writer.write("Jasprit Bumrah");
            writer.newLine();
            System.out.println("data entered");
            writer.close();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
