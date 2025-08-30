package RecursionProblemssSynopisPreparation.FileHandling.RetrvingAllDataTypesFromFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
public class CodeToReadAllDataTypesOfFile
{
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        try {
            File file = new File("data.txt");   // file path
            BufferedReader br = new BufferedReader(new FileReader(file));

            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(","); // split by comma
                int id = Integer.parseInt(parts[0].trim());
                String name = parts[1].trim();
                double salary = Double.parseDouble(parts[2].trim());

                Employee emp = new Employee(id, name, salary);
                employees.add(emp);
            }
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Display all employees
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
