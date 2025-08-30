package ADVANCEDJAVA2025CHANTI.JDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetriveNamesAsceinding {
    public RetriveNamesAsceinding() {
    }

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/chanti";
        String user = "root";
        String password = "S!ng@m@123%";
        String query = "SELECT name FROM employees ORDER BY name ASC";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            System.out.println("Names in Ascending Order:");

            while(rs.next()) {
                String empName = rs.getString("name");
                System.out.println(empName);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
