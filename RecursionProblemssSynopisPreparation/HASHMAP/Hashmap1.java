package RecursionProblemssSynopisPreparation.HASHMAP;

// Java Program to Demonstrate
// Working of Map interface

// Importing required classes
import java.util.*;
public class Hashmap1 {

    // Main driver method
    public static void main(String args[])
    {
        Map<String, Integer> hm = new HashMap<String, Integer>();
        // Inserting pairs in above Map
        // using put() method
        hm.put("a", 100);
        hm.put("b", 200);
        hm.put("c", 300);
        hm.put("d", 400);
/*
        // Traversing through Map using for-each loop
        for (Map.Entry<String, Integer> me : hm.entrySet()) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
*/

        System.out.println("printed" +hm.get(400));

        Map<Integer,String > map=new HashMap<Integer,String>();

        map.put(1,"venky");
        map.put(2,"venky");
        map.put(3,"venky");
        map.put(4,"venky");
       // map.remove(1);
        map.put(1,"singam");

        for(Map.Entry<Integer,String > aa:map.entrySet())
        {
            System.out.println(aa.getKey() +" value is : " + aa.getValue());
        }


      //  System.out.println("size of hashmap is " +map.size());

       // System.out.println(map.values());
       // System.out.println(map.keySet() +" " + map.values());
        map.put(2,"suma");
       // System.out.println(map);

       // System.out.println(map.get(1));




    }
}