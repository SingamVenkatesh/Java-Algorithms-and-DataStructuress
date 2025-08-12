package RecursionProblemssSynopisPreparation.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadStringandReverse
{
    public static void main(String[] args) {
        // reading names and printing in reverse
        try
        {
            String line;
            BufferedReader reader=new BufferedReader(new FileReader("example.txt"));
            while ((line=reader.readLine())!=null)
            {
                StringBuffer sb=new StringBuffer(line);
                System.out.println(sb.reverse());
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
