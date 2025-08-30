package ADVANCEDJAVA2025CHANTI.JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dbcon {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/chanti";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "S!ng@m@123%";

    public Dbcon() {
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/chanti", "root", "S!ng@m@123%");
    }

    public static boolean isEmployeeExist(int id) {
        boolean flag = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/chanti", "root", "S!ng@m@123%");
            System.out.println("Connection established");
            String query = "SELECT 1 FROM Nandhanavam WHERE plotno = ?";
            PreparedStatement psmt = conn.prepareStatement(query);
            psmt.setInt(1, id);
            ResultSet rs = psmt.executeQuery();
            flag = rs.next();
            rs.close();
            psmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return flag;
    }

    public static void RetriveNamesInAscending() {
        String query = "SELECT name FROM employees ORDER BY name ASC";

        try {
            Connection conn = getConnection();
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

    public static int deleteRecord(int plotno) {
        int rows = -1;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chanti", "root", "S!ng@m@123%");
            String sql = "DELETE FROM Nandhanavam WHERE plotno = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, plotno);
            rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Record deleted successfully!");
            } else {
                System.out.println("No matching record found.");
            }

            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return rows;
    }

    public static int updateTable() {
        int rows = -1;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chanti", "root", "S!ng@m@123%");
            String sql = "UPDATE Nandhanavam SET salary = ? WHERE plotno = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setDouble(1, (double)60000.0F);
            pstmt.setInt(2, 101);
            rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Salary updated successfully!");
            } else {
                System.out.println("No matching record found.");
            }

            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return rows;
    }

    public static void main(String[] args) {
        new RetriveNamesAsceinding();
    }

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully!");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Failed to load JDBC driver", e);
        }
    }
}


