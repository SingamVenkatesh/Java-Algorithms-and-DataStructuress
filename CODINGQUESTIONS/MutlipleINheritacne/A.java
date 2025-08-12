package CODINGQUESTIONS.MutlipleINheritacne;

public class A {
    void sound()
    {
        System.out.println("Bark");
    }
}
 class B extends A {
    void sound()
    {
        System.out.println("B");
    }
}
 class C extends  A{
    void sound()
    {
        System.out.println("C");
    }
}
