package RecursionProblemssSynopisPreparation;

import java.util.*;

public class Anagramm {

    // Main method to run and test the function
    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};

        // Call the groupAnagrams function
        List<List<String>> result = groupAnagrams(input);

        /*Print the result
        for (List<String> group : result) {
            System.out.println(group);
        }*/
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        // Create a HashMap to store grouped anagrams
        HashMap<String, List<String>> map = new HashMap<>();
        // Loop through each word in the input array
        for (String word : strs)
        {
            // Convert the word to a char array
            char[] chars = word.toCharArray();

            // Sort the char array
            Arrays.sort(chars);

            // Convert the sorted char array back to a string
            String sorted = new String(chars);

            // If the sorted string is not in the map, add it with an empty list
            if (!map.containsKey(sorted))
            {
                map.put(sorted, new ArrayList<>());
            }

            // Add the original word to the corresponding list
            map.get(sorted).add(word);
        }
      //  System.out.println(map.keySet());
       // System.out.println(map.values());



        for(Map.Entry<String,List<String>> aa:map.entrySet())
        {
            System.out.println("Key is "+ aa.getKey() +" "+ "value is " + aa.getValue());
        }

        // Return all grouped anagram lists
        return new ArrayList<>(map.values());
    }


}
