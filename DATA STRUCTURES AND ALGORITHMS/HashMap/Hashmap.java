package RecursionLearning.HashMap;
import java.util.HashMap;

public class Hashmap
{
    public static void main(String[] args)
    {
        HashMap<Integer, String> map = new HashMap<>();

        // Adding elements (put method)
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");
        //System.out.println(map.get(1));// java
        //map.remove(1); removes first key value
        System.out.println("map keyset" + map.keySet());
        System.out.println("map entryset" +map.entrySet());
        System.out.println("map values" + map.values());
        System.out.println(map.size());
        System.out.println(map.containsKey(3));
        System.out.println();

        for (HashMap.Entry<Integer, String> venky: map.entrySet()) {
            System.out.println(venky.getKey() + " -> " + venky.getValue());
        }

        map.forEach((keyy, valuee)->System.out.println(keyy + " -> " + valuee));


        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }






    }
}
