package RecursionProblemssSynopisPreparation.JDBCPROGRAMS.Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conn
{
    public static Connection con=null;

    public static Connection DbCon()
    {

        // here insteading of writing loading driver class and connection i created a method i will use

        String user_name="root";
        String password="S!ng@m@123%";

        String url="jdbc:mysql://localhost:3306/practice_db";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

             con= DriverManager.getConnection(url,user_name,password);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
      return con;
    }


}
