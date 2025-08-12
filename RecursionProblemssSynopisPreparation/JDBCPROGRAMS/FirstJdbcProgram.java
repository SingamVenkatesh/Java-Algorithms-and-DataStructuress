package RecursionProblemssSynopisPreparation.JDBCPROGRAMS;
import RecursionProblemssSynopisPreparation.JDBCPROGRAMS.Connection.Conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
public class FirstJdbcProgram
{

    public static Connection con=null;

     public static int updatingTable() throws SQLException {

         Connection con= Conn.DbCon();

         Statement statement=con.createStatement();
         // String str="create table Venky(id int primary key ,name varchar(20),salary float)";
         // String str="insert into Venky values(12,'venky',1234)";
         String str="update Venky set name='Vishnu' where id='12'";
         int result=statement.executeUpdate(str);
         System.out.println(result);
         con.close();
         statement.close();
         return result;
     }


     public static int saveEmployrecord() throws SQLException {
         Connection con=Conn.DbCon();
         Statement statement=con.createStatement();
         String str="insert into Venky values(13,'rakesh',8999)";
         int res=statement.executeUpdate(str);
         con.close();
         statement.close();
         return res;
     }

     public static int deleteempRec() throws SQLException
     {
         Connection con=Conn.DbCon();
         Statement statement=con.createStatement();
         String str="delete from Venky where id=13";
         int res=statement.executeUpdate(str);
         con.close();
         statement.close();
         return res;

     }


     public static int enterindMulltipleRecords() throws SQLException {
         Connection con=Conn.DbCon();
         String insertQuery="insert into Venky(id, name, salary) values (?,?,?)";
         PreparedStatement pstmt=con.prepareStatement(insertQuery);



         int recordsinserted=0;
         // First Record
         pstmt.setInt(1, 1);
         pstmt.setString(2, "Alice");
         pstmt.setFloat(3, 5000.0f);
         recordsinserted=recordsinserted+ pstmt.executeUpdate();

// Second Record
         pstmt.setInt(1, 2);
         pstmt.setString(2, "Bob");
         pstmt.setFloat(3, 6000.0f);
         recordsinserted=recordsinserted+ pstmt.executeUpdate();
         pstmt.close();


return recordsinserted;

     }


    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
        /*
        String user_name="root";
        String password="S!ng@m@123%";
        String url="jdbc:mysql://localhost:3306/practice_db";
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("driver loaded");
        Connection con= DriverManager.getConnection(url,user_name,password);
        System.out.println("connection establised");
        */

        //int ans=updatingTable();
        //System.out.println(ans);

        //System.out.println(saveEmployrecord()==1?"one employ record inserted":"not inserted");

      //  System.out.println(deleteempRec()==1?"one record deleted ":"no record deleted");




        int rowsInserted=enterindMulltipleRecords();
        System.out.println("no of rows inserted : " +rowsInserted );




    }
}














/*   1. Multiple Execute Updates (Basic Way)

String insertQuery = "INSERT INTO Venky (id, name, salary) VALUES (?, ?, ?)";
PreparedStatement pstmt = con.prepareStatement(insertQuery);

// First Record
pstmt.setInt(1, 1);
pstmt.setString(2, "Alice");
pstmt.setFloat(3, 5000.0f);
pstmt.executeUpdate();

// Second Record
pstmt.setInt(1, 2);
pstmt.setString(2, "Bob");
pstmt.setFloat(3, 6000.0f);
pstmt.executeUpdate();

pstmt.close();






2.2. Batch Insert Using addBatch()
String insertQuery = "INSERT INTO Venky (id, name, salary) VALUES (?, ?, ?)";
PreparedStatement pstmt = con.prepareStatement(insertQuery);

pstmt.setInt(1, 3);
pstmt.setString(2, "Charlie");
pstmt.setFloat(3, 7000.0f);
pstmt.addBatch();

pstmt.setInt(1, 4);
pstmt.setString(2, "David");
pstmt.setFloat(3, 8000.0f);
pstmt.addBatch();

// Execute all insertions at once
int[] results = pstmt.executeBatch();

System.out.println("Inserted " + results.length + " records successfully.");

pstmt.close();






3. Insert Multiple Rows in One Query (SQL-only)
String str = "INSERT INTO Venky (id, name, salary) VALUES " +
             "(5, 'Emma', 9000.0), " +
             "(6, 'Frank', 10000.0)";

Statement statement = con.createStatement();
statement.executeUpdate(str);
statement.close();

 */
