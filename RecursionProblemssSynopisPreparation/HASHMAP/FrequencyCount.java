package RecursionProblemssSynopisPreparation.HASHMAP;
import java.util.*;

public class FrequencyCount {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,5,6};

        HashMap<Integer, Integer> map = new HashMap<>();



        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(map);
        System.out.println(map.get(4));

        // Output: {1=3, 2=3, 3=1, 4=1, 5=1}
    }
}
