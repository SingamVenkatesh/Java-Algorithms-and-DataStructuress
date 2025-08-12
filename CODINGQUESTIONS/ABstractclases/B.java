package CODINGQUESTIONS.ABstractclases;

public class B extends A{

        void sound()
        {
            System.out.println("THis is abstact method declared in subclas");
        }

    public static void main(String[] args) {
        B o=new B();
        o.sound();
        o.greet();
    }




}
