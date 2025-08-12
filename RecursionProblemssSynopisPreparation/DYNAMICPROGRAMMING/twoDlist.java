package RecursionProblemssSynopisPreparation.DYNAMICPROGRAMMING;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class twoDlist
{
    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(Arrays.asList(1, 2));
        matrix.add(Arrays.asList(3, 4, 5));
      //  System.out.println(matrix.size());             // Output: 2 (number of rows)
      //  System.out.println(matrix.get(0).size());      // Output: 2 (size of first row)
      //  System.out.println(matrix.get(1).size());
        System.out.println(matrix);// Output: 3 (size of second row)
        System.out.println(matrix.size());
        System.out.println(matrix.get(1).size());



    }
}
