package RecursionProblemssSynopisPreparation.JDBCPROGRAMS;

import RecursionProblemssSynopisPreparation.JDBCPROGRAMS.Connection.Conn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

public class InsertingUsingBatchaddBatch

{


    public static Connection con=null;

    public static int[] multipleIsertionUsingBatc() throws SQLException {
        Connection con= Conn.DbCon();

        String insertQuery = "INSERT INTO Venky (id, name, salary) VALUES (?, ?, ?)";
        PreparedStatement pstmt = con.prepareStatement(insertQuery);

        pstmt.setInt(1, 8);
        pstmt.setString(2, "Charlie");
        pstmt.setFloat(3, 7000.0f);
        pstmt.addBatch();

        pstmt.setInt(1, 9);
        pstmt.setString(2, "David");
        pstmt.setFloat(3, 8000.0f);
        pstmt.addBatch();

// Execute all insertions at once
        int[] results = pstmt.executeBatch();

        System.out.println("Inserted " + results.length + " records successfully.");

        pstmt.close();
        return results;
    }

    public static void main(String[] args) throws SQLException
    {
        int[] ans=multipleIsertionUsingBatc();
        System.out.println(Arrays.toString(ans));

    }
}
