package RecursionProblemssSynopisPreparation.JDBCPROGRAMS.Taskk;

import RecursionProblemssSynopisPreparation.JDBCPROGRAMS.Connection.Conn;

import java.sql.*;

public class JDBCPorgramsOnCustomer
{

    public static void createTable() throws SQLException {

        Connection con=Conn.DbCon();
        Statement statement=con.createStatement();
        String str="create table Customer(id int primary key , password varchar(20) , name varchar(20),city varchar(20))";
        int ans=statement.executeUpdate(str);

        System.out.println(ans);
    }

    public static int insertIntoCustomer(Customer cus) throws SQLException
    {

        Connection con=Conn.DbCon();
        String  str="insert into Customer values (?,?,?,?)";
        PreparedStatement statement=con.prepareStatement(str);


        int resultRecordsinserted=0;
        statement.setInt(1,cus.getId());
        statement.setString(2,cus.getPassword());
        statement.setString(3,cus.getName());
        statement.setString(4,cus.getCity());

        resultRecordsinserted=resultRecordsinserted+statement.executeUpdate();

        statement.close();
        con.close();

        return resultRecordsinserted;



    }


    public static void RetriveDataFromDb() throws SQLException
    {

        Connection con=Conn.DbCon();

        String str="select * from Customer";
        PreparedStatement smt=con.prepareStatement(str);

        ResultSet rs=smt.executeQuery();

        while(rs.next())
        {
            System.out.print (rs.getInt("id") + "  ");
            System.out.print(rs.getString("password")+ "  ");
            System.out.print(rs.getString("name")+"   ");
            System.out.print(rs.getString("city"));
            System.out.println();
        }


    }



    public static ResultSet RetriveOneEmployById(int id) throws SQLException {
        Connection con=Conn.DbCon();
       String query1="select * from Customer where id=14";
        String query="select * from Customer";
        Statement smpt=con.createStatement();
        //int ans=smpt.exe(query);
        ResultSet rs= smpt.executeQuery(query);

        while (rs.next())
        {
           if(rs.getInt("id")==14)
           {
               System.out.println("Id is present");
               System.out.println(rs.getInt("id"));
               System.out.println(rs.getInt("password"));
               System.out.println(rs.getInt("name"));
               System.out.println(rs.getInt("city"));


           }
           else
           {
               System.out.println("id is not present");
           }
        }
        return rs;


    }


    public static void main(String[] args) throws SQLException {

        Customer cus=new Customer(14,"venky1223","rocky","Delhi");

    //  int insertResult=insertIntoCustomer(cus);
      // System.out.println("no of result inserted : " + insertResult );

       // RetriveDataFromDb();

        //ResultSet rs=RetriveOneEmployById();
       // System.out.println("this query is to retrive one employ " + rs);
    }
}
