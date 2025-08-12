package CODINGQUESTIONS;
public class Inheritance {
    void sound()
    {
        System.out.println("This is sound");
    }
}
class B extends Inheritance
{
    void sound()
    {
        super.sound();
        System.out.println("this is from B");
    }
}
class C extends B
{
    void sound()
    {
        super.sound();
        System.out.println("this is from C");
    }
}


