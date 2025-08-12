package RecursionProblemssSynopisPreparation.AbstractClassess;

public abstract class AbstractClass
{
    public abstract void abmethod();



    public void method1()
    {
        System.out.println("this is non abstract method from abstract method");
    }
    AbstractClass()
    {
        System.out.println("this is constructor from abstract class");
    }

    public static void sstaticmethodd()
    {
        System.out.println("this is static method from abstract method");
    }

    }

 class MMain extends AbstractClass
{
    public void abmethod()
    {
        System.out.println("this is abstarct method");
    }




}
