package ADVANCEDJAVA2025CHANTI.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateJdbc {
    public UpdateJdbc() {
    }

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database";
        String user = "root";
        String password = "S!ng@m@123% ";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            String sql = "UPDATE Nandhanavam SET salary = ? WHERE plotno = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setDouble(1, (double)60000.0F);
            pstmt.setInt(2, 101);
            int rows = pstmt.executeUpdate();
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

    }
}
