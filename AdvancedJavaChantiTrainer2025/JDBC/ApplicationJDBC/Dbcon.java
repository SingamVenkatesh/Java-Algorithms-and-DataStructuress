package AdvancedJavaChantiTrainer2025.JDBC.ApplicationJDBC;


import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Dbcon {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/chanti";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "S!ng@m@123%";

    public Dbcon() {
    }

    public static Connection getConnection() throws SQLException
    {
        Connection conn=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
            Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            System.out.println("Connection established");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return conn;
    }


}
