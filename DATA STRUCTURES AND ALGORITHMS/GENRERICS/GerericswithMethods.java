package RecursionLearning.GENRERICS;
public class GerericswithMethods
{
    public static void main(String[] args)
    {
        swap(4,2);
        swap("Venky","singam");
        swap(2.33,1.22);
        swap(false,true);
        swappppp(7,6);
       // swappppp("fds","gfds");

    }

    public static <T> void swap(T i, T j)
    {
        System.out.println("Before swapping " + i + " "  +  j);
        T temp;
        temp=i;
        i=j;
        j=temp;
        System.out.println("After swapping " + i + " "  +  j);
    }

    public static <T extends Number> void swappppp(T i, T j)
    {
        // when we extteendssss number in generics we cannot pass the values greater than the strings
        System.out.println("Before swapping " + i + " "  +  j);
        T temp;
        temp=i;
        i=j;
        j=temp;
        System.out.println("After swapping " + i + " "  +  j);
    }
}

