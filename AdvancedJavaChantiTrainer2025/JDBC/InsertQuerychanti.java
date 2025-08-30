package ADVANCEDJAVA2025CHANTI.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertQuerychanti {
    public InsertQuerychanti() {
    }

    public static void main(String[] args) throws ClassNotFoundException {
        String DB_URL = "jdbc:mysql://localhost:3306/chanti";
        String DB_USER = "root";
        String DB_PASSWORD = "S!ng@m@123%";

        try {
            Connection conn = Dbcon.getConnection();
            String query = "INSERT INTO Nandhanavam (plotno, name, job, salary, children) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement psmt = conn.prepareStatement(query);
            psmt.setInt(1, 408);
            psmt.setString(2, "karthi");
            psmt.setString(3, "SI");
            psmt.setDouble(4, (double)14000.0F);
            psmt.setInt(5, 4);
            int rows = psmt.executeUpdate();
            if (rows > 0) {
                System.out.println("rows inserted");
            }

            conn.close();
            psmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
