package RecursionProblemssSynopisPreparation.FileHandling;

import java.io.FileReader;
import java.io.IOException;
public class ReadingCharactersFromFile
{
    public static void main(String[] args) {


       try
       {
           FileReader reader=new FileReader("example.txt");
           int ch;
               while ((ch = reader.read()) != -1)
               {
                   System.out.println((char)ch);
               }
               reader.close();
       }
       catch (Exception e)
       {
           e.printStackTrace();
       }

    }
}
