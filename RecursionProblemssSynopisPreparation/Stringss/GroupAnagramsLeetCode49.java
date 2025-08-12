package RecursionProblemssSynopisPreparation.Stringss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagramsLeetCode49
{
    public static void main(String[] args) {
       String[] strs = {"eat","tea","tan","ate","nat","bat"};
       List<List<String>> list=ansFun(strs);
        System.out.println(list);
    }

    private static List<List<String>> ansFun(String[] strs)
    {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);  // this will be the key

            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(word);
        }

        return new ArrayList<>(map.values());
    }



}

