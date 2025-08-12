package RecursionLearning;

import java.util.HashSet;

public class DuplicaesRemoveFromString {
    public static void main(String[] args) {
        //Input: "banana"
        //Output: "ban"
        String str = "banana";
        String ans="";
        HashSet<Character> set=new HashSet<>();

        for (int i = 0; i < str.length(); i++)
        {
            set.add(str.charAt(i));
        }

        System.out.println(set);
    }
}
