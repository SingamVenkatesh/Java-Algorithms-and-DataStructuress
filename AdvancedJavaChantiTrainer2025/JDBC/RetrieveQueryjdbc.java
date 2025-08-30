package ADVANCEDJAVA2025CHANTI.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveQueryjdbc {
    public RetrieveQueryjdbc() {
    }

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/chanti";
        String user = "root";
        String password = "S!ng@m@123%";
        String query = "SELECT plotno, name, job, salary, children FROM Nandhanavam";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chanti", "root", "S!ng@m@123%");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while(rs.next()) {
                int plotno = rs.getInt("plotno");
                String name = rs.getString("name");
                String job = rs.getString("job");
                double salary = rs.getDouble("salary");
                int children = rs.getInt("children");
                System.out.println(plotno + " |" + name + " | " + job + " | " + salary + " | " + children);
            }

            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
