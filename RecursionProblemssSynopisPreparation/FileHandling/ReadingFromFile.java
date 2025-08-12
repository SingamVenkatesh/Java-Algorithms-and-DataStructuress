package RecursionProblemssSynopisPreparation.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ReadingFromFile {
    public static void main(String[] args) {

        try
        {
        BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
        String line;
        ArrayList<String > list=new ArrayList<>();

        while ((line=reader.readLine()) !=null)
        {
            list.add(line);
        }
        reader.close();

            System.out.println(list);



            for(int i=list.size()-1;i>0;i--)
            {
                System.out.println(list.get(i));
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
