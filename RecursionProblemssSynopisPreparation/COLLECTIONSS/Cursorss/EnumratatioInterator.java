package RecursionProblemssSynopisPreparation.COLLECTIONSS.Cursorss;

import java.util.*;

public class EnumratatioInterator {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);

        Enumeration<Integer> e = v.elements();

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
