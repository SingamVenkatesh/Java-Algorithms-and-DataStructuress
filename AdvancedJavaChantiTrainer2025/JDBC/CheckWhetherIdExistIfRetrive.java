package ADVANCEDJAVA2025CHANTI.JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class CheckWhetherIdExistIfRetrive {
    public static final String DB_URL = "jdbc:mysql://localhost:3306/chanti";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "S!ng@m@123%";

    public CheckWhetherIdExistIfRetrive() {
    }

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/chanti", "root", "S!ng@m@123%");
            System.out.println("Connection established");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the plot number you want to retrieve: ");
            int plott = sc.nextInt();
            String query = "SELECT * FROM Nandhanavam WHERE plotno = ?";
            PreparedStatement psmt = conn.prepareStatement(query);
            psmt.setInt(1, plott);
            ResultSet rs = psmt.executeQuery();
            if (rs.next()) {
                int plotno = rs.getInt("plotno");
                String name = rs.getString("name");
                String job = rs.getString("job");
                double salary = rs.getDouble("salary");
                int children = rs.getInt("children");
                System.out.println(plotno + " | " + name + " | " + job + " | " + salary + " | " + children);
            } else {
                System.out.println("No record found for plot number: " + plott);
            }

            rs.close();
            psmt.close();
            conn.close();
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
