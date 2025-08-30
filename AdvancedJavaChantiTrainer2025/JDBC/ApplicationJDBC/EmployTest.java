package AdvancedJavaChantiTrainer2025.JDBC.ApplicationJDBC;
import java.util.ArrayList;

public class EmployTest
{
    public static void main(String[] args)
    {
        Employe e1 = new Employe(5, "rajesh", 8999.0F);
        System.out.println(e1);
        EmployDao e=new EmployDao();
       ArrayList<Employe> list= e.loadAllEmploysInArrayList();

       for(Employe s:list)
       {
           System.out.println(s);
       }

       Employe s=new Employe(8,"Sampath",45558);
       int a=e.saveEmploy(s);
        System.out.println(a);
    }
}
