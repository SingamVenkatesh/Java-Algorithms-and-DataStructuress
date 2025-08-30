package ADVANCEDJAVA2025CHANTI.JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployDao {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/chanti";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "S!ng@m@123%";

    public EmployDao() {
    }

    public static void createTable() {
        Connection con = null;
        String createTableQuery = "CREATE TABLE Employee (emp_id INT PRIMARY KEY, name VARCHAR(50), salary float, ";

        try {
            con = Dbcon.getConnection();
            System.out.println("Driver loaded successfully!");
            System.out.println("Connection established successfully!");
            Statement smt = con.createStatement();
            smt.executeQuery(createTableQuery);
            System.out.println("Employee table created successfully!");
            smt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static int deleteEmploy(int plotno) {
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

    public static int saveEmploy() {
        int rows = -1;

        try {
            Connection conn = Dbcon.getConnection();
            String query = "INSERT INTO Nandhanavam (plotno, name, job, salary, children) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement psmt = conn.prepareStatement(query);
            psmt.setInt(1, 408);
            psmt.setString(2, "karthi");
            psmt.setString(3, "SI");
            psmt.setDouble(4, (double)14000.0F);
            psmt.setInt(5, 4);
            rows = psmt.executeUpdate();
            if (rows > 0) {
                System.out.println("rows inserted");
            }

            conn.close();
            psmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return rows;
    }

    public static int updateEmploy() {
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

    public static void RetriveNamesInAscending() {
        String query = "SELECT name FROM employees ORDER BY name ASC";

        try {
            Connection conn = Dbcon.getConnection();
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

    public static void main(String[] args) {
        new RetriveNamesAsceinding();
    }
}
