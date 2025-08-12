package RecursionProblemssSynopisPreparation.LamdaExpreesion;

import java.util.*;
public class WithOutLamda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Amit", "Zara", "Karan");

        Collections.sort(names, new Comparator<String>()
        {
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });

        System.out.println("Sorted names: " + names);
        System.out.println(names);
    }
}
