package ADVANCEDJAVA2025CHANTI.JDBC.PropertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class BatchProcesingDemo {
    public BatchProcesingDemo() {
    }
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        FileInputStream file = new FileInputStream("db.properties");
        p.load(file);
        System.out.println(p.getProperty("driverclassName"));
        System.out.println(p.getProperty("dburl"));
        System.out.println(p.getProperty("dbuser"));
        System.out.println(p.getProperty("dbpassword"));


        try {
           Class.forName(p.getProperty("driverclassName"));
            Connection con= DriverManager.getConnection(p.getProperty("dburl"),p.getProperty("dbuser"),p.getProperty("dbpassword"));
            String s1="insert into Employee values(6,'ram',54333)";
            String s2="update Employee set salary=salary+19000 where emp_id=2";
            String s3="delete from Employee where emp_id=4";

            Statement smt=con.createStatement();
            smt.addBatch(s1);
            smt.addBatch(s2);
            smt.addBatch(s3);

           // execute batch will return integer array which results in 1 if query successfull
            int[] res= smt.executeBatch();
            for(int i=0;i<res.length;i++ )
            {
                System.out.println(i+1 + " query " + res[i]);
            }
            smt.close();
            con.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
