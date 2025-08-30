package ADVANCEDJAVA2025CHANTI.JDBC;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class RetrvingWithColumnNames {
    public RetrvingWithColumnNames() {
    }

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/chanti";
        String user = "root";
        String password = "S!ng@m@123%";
        String query = "SELECT * FROM Nandhanavam";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();

            for(int i = 1; i <= columnCount; ++i) {
                rsmd.getColumnType(i);
                PrintStream var10000 = System.out;
                String var10001 = rsmd.getColumnName(i);
                var10000.print(var10001 + "\t");
            }

            System.out.println("\n-------------------------------------");

            while(rs.next()) {
                for(int i = 1; i <= columnCount; ++i) {
                    PrintStream var14 = System.out;
                    String var15 = rs.getString(i);
                    var14.print(var15 + "\t");
                }

                System.out.println();
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
