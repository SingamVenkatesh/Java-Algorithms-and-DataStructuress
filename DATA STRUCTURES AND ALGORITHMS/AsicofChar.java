package RecursionLearning;
interface AsicofChar
{
    default void naaamm()
    {
        System.out.println(" default method");
    }
    static void age()
    {
        System.out.println("static method in interface");
    }
     void runnn();
     public static void namee()
     {
         System.out.println("name is venky");
     }
}
class A implements AsicofChar
{
     public void runnn()
    {
        System.out.println("method");
    }
}
class B implements AsicofChar
{
    public void runnn()
    {
        System.out.println("method");
    }
}
class Main
{
    public static void main(String[] args) {
        A obj=new A();
       obj.runnn();
       obj.naaamm();


    }
}
