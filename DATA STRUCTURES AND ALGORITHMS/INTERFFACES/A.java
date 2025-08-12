package RecursionLearning.INTERFFACES;

public interface A {

    default void greet()
    {
        System.out.println("THis is defualt method from Inteface A");
    }
    void location();
}

