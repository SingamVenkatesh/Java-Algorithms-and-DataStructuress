package RecursionLearning.StringQuestions;


import java.util.ArrayList;
import java.util.List;

public class SubsetWithoutRecursion {
    public static void main(String[] args) {
        String str = "abc";
        List<String> subsets = generateSubsets(str);
        System.out.println(subsets);
    }

    public static List<String> generateSubsets(String str) {
        int n = str.length();
        int totalSubsets = (1 << n);  // 2^n subsets
        List<String> result = new ArrayList<>();

        for (int i = 0; i < totalSubsets; i++) {  // Iterate over 2^n subsets
            StringBuilder subset = new StringBuilder();

            for (int j = 0; j < n; j++) {  // Check each bit position
                if ((i & (1 << j)) != 0) {  // If j-th bit is set, include character
                    subset.append(str.charAt(j));
                }
            }
            result.add(subset.toString());
        }
        return result;
    }
}

