package RecursionProblemssSynopisPreparation;

import jdk.jfr.FlightRecorderListener;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSettt {
    public static void main(String[] args)

    {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        //System.out.println(set1);


        HashSet<Integer> set2=new HashSet<>();
        set2.add(2);
        set2.add(1);

        HashSet<Integer> set3=new HashSet<>();
        set3.add(2);

        HashSet<HashSet<Integer>> set4=new HashSet<>();

        set4.add(set1);
        set4.add(set2);
        set4.add(set3);
        //System.out.println(set4);

/*
        System.out.println("Set 1" +set1);
        System.out.println("Set 2" +set2);
        System.out.println("Set 3" +set3);
*/

/*
        List<List<Integer>> answer=new ArrayList<>();

        for(HashSet a: set4)
        {
            List<Integer> list=new ArrayList<>(a);
          answer.add(list);

        }
        System.out.println( answer);
*/





        HashSet<Integer> sett = new HashSet<>();
        sett.add(1);
        sett.add(2);
        sett.add(3);
        //System.out.println(sett);


        List<Integer> listt=new ArrayList<>();

        for(Integer a:sett)
        {
            listt.add(a);
        }

        System.out.println(sett);
       System.out.println("THis list created from hashet  elments " + listt);





    }
}
