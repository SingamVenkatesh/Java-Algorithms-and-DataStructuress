package RecursionProblemssSynopisPreparation.COLLECTIONSS.ListInterface;

import java.util.List;
import java.util.Vector;

public class Vectorr
{
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();



        // initial capacity is 10 then grows like 2* intitalcpacity


        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        System.out.println("Vector: " + vector);

        vector.add(1, "Mango");
        System.out.println("After inserting Mango at index 1: " + vector);

        System.out.println("First Element: " + vector.firstElement());
        System.out.println("Last Element: " + vector.lastElement());

        vector.remove("Banana");
        System.out.println("After removing Banana: " + vector);

        System.out.println("Contains Apple? " + vector.contains("Apple"));
        System.out.println("Size: " + vector.size());
        System.out.println("Capacity: " + vector.capacity());
    }
}
