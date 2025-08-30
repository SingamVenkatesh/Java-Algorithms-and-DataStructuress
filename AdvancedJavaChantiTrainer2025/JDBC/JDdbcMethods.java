package ADVANCEDJAVA2025CHANTI.JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDdbcMethods {
    public static final String DB_URL = "jdbc:mysql://localhost:3306/chanti";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "S!ng@m@123%";

    public JDdbcMethods() {
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
}
