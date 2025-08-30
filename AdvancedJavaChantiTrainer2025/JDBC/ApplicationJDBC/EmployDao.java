package AdvancedJavaChantiTrainer2025.JDBC.ApplicationJDBC;

import ADVANCEDJAVA2025CHANTI.JDBC.Dbcon;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

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

    public static int saveEmploy(Employe employe) {
        int rows = -1;

        try {
            Connection conn = Dbcon.getConnection();
            String query = "INSERT INTO Employee (emp_id, name, salary) VALUES (?, ?, ?)";
            PreparedStatement psmt = conn.prepareStatement(query);
            psmt.setInt(1, employe.getId());
            psmt.setString(2, employe.getName());
            psmt.setFloat(3, employe.getSalary());
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

    public static void loadAllEmploys() {
        try {
            Connection con = Dbcon.getConnection();
            String query = "select * from Employee";
            PreparedStatement psmt = con.prepareStatement(query);
            ResultSet rs = psmt.executeQuery();
            ResultSetMetaData rsmdata = rs.getMetaData();
            int columnsCount = rsmdata.getColumnCount();

            for(int i = 1; i <= columnsCount; ++i) {
                PrintStream var10000 = System.out;
                String var10001 = rsmdata.getColumnName(i);
                var10000.print(var10001 + " ");
            }

            System.out.println();

            while(rs.next()) {
                for(int i = 1; i <= columnsCount; ++i) {
                    PrintStream var9 = System.out;
                    String var10 = rs.getString(i);
                    var9.print(var10 + " ");
                }

                System.out.println();
            }

            psmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static ArrayList<Employe> loadAllEmploysInArrayList() {
        ArrayList<Employe> list = new ArrayList();

        try {
            Connection con = Dbcon.getConnection();
            String query = "SELECT * FROM Employee";
            PreparedStatement psmt = con.prepareStatement(query);
            ResultSet rs = psmt.executeQuery();

            while(rs.next()) {
                int id = rs.getInt("emp_id");
                String name = rs.getString("name");
                float salary = rs.getFloat("salary");
                Employe emp = new Employe(id, name, salary);
                list.add(emp);
            }

            psmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public static void loadEmployById(int id) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/chanti", "root", "S!ng@m@123%");
            System.out.println("Connection established");
            String query = "SELECT * FROM Employee WHERE emp_id = ?";
            PreparedStatement psmt = conn.prepareStatement(query);
            psmt.setInt(1, id);
            ResultSet rs = psmt.executeQuery();
            if (rs.next()) {
                int emp_id = rs.getInt("emp_id");
                String name = rs.getString("name");
                double salary = (double)rs.getFloat("salary");
                System.out.println("Emp_id is :" + emp_id + " name  is  :" + name + " salary is : " + salary);
            } else {
                System.out.println("No record found for plot number: " + id);
            }

            rs.close();
            psmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

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

}
