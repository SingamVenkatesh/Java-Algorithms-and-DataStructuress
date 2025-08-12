package RecursionProblemssSynopisPreparation.JDBCPROGRAMS.Taskk;

public class Customer {

    public static int id;
    public static String password;
    public static String name;
    public static String city;

    Customer(int id,String password,String name,String city)
    {
        this.id=id;
        this.password=password;
        this.name=name;
        this.city=city;
    }

   public int getId()
   {
       return id;
   }
   public void setId(int id)
   {
       this.id=id;
   }


    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password=password;
    }



    public String  getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }


    public String getCity()
    {
        return city;
    }
    public void setCity(String city)
    {
        this.city=city;
    }

    public String toString()
    {
        return id+" " + password+ " " + name  +" " + city;
    }
}
