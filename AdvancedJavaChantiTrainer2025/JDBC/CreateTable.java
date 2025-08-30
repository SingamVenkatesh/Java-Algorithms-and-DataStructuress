package ADVANCEDJAVA2025CHANTI.JDBC;


import java.sql.Connection;
import java.sql.Statement;

public class CreateTable {
    public CreateTable() {
    }

    public static void main(String[] args) {
        String DB_URL = "jdbc:mysql://localhost:3306/chanti";
        String DB_USER = "root";
        String DB_PASSWORD = "S!ng@m@123%";
        Connection con = null;
        String createTableQuery = "CREATE TABLE Employee (emp_id INT PRIMARY KEY, name VARCHAR(50), salary FLOAT)";

        try {
            con = Dbcon.getConnection();
            System.out.println("Driver loaded successfully!");
            System.out.println("Connection established successfully!");
            Statement smt = con.createStatement();
            smt.executeUpdate(createTableQuery);
            System.out.println("Employee table created successfully!");
            smt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
