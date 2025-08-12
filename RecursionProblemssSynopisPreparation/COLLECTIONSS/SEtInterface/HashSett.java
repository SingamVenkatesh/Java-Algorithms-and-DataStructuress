package RecursionProblemssSynopisPreparation.COLLECTIONSS.SEtInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSett
{
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println(set);


        LinkedHashSet<Integer> Lset=new LinkedHashSet<>();
        Lset.add(10);
        Lset.add(20);
        Lset.add(30);
        System.out.println(Lset);
    }
}
