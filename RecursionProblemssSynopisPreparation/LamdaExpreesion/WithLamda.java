package RecursionProblemssSynopisPreparation.LamdaExpreesion;
import java.util.*;
public class WithLamda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Amit", "Zara", "Karan");

        names.sort((s1, s2) -> s1.compareTo(s2));

        System.out.println("Sorted names: " + names);
    }
}
