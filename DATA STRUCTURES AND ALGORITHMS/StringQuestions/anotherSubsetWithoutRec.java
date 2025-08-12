package RecursionLearning.StringQuestions;

import java.util.ArrayList;
import java.util.List;

public class anotherSubsetWithoutRec {
    public static void main(String[] args) {
        String str = "abc";
        List<String> subsets = new ArrayList<>();
        subsets.add(""); // Start with an empty subset

        for (char ch : str.toCharArray()) {
            int size = subsets.size();
            for (int i = 0; i < size; i++) {
                subsets.add(subsets.get(i) + ch);
            }
        }
        System.out.println(subsets);
    }
}

