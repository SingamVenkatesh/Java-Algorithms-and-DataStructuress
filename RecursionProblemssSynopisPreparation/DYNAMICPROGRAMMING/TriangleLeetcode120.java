package RecursionProblemssSynopisPreparation.DYNAMICPROGRAMMING;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TriangleLeetcode120
{
    public static void main(String[] args)
    {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(3, 4));
        triangle.add(Arrays.asList(6,5,7));
       // triangle.add(Arrays.asList(4,1,8,3));
        System.out.println(triangle);
        int ans=  minimumTotal(triangle);

        System.out.println(ans);

      //  Integer[][] arr=new Integer[2][2];
       // System.out.println(Arrays.toString(arr));
       // System.out.println(Arrays.deepToString(arr));

       // int[][] str=new int[2][2];
     //   System.out.println(Arrays.deepToString(str));

    }
    public static int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        Integer[][] memo = new Integer[n][n];

        System.out.println(Arrays.deepToString(memo));
        return helper(0, 0, triangle, memo);
    }
    public static int helper(int i, int j, List<List<Integer>> triangle, Integer[][] memo)
    {
      //  System.out.println(Arrays.deepToString(memo));
        if (i == triangle.size() - 1) {
            return triangle.get(i).get(j);
        }
        if (memo[i][j] != null) {
            return memo[i][j];
        }
        int down = helper(i + 1, j, triangle, memo);
        int diagonal = helper(i + 1, j + 1, triangle, memo);
        memo[i][j] = triangle.get(i).get(j) + Math.min(down, diagonal);
       // System.out.println(Arrays.deepToString(memo));
        return memo[i][j];
    }
}

/*
[
final table storage dp
 [11, null, null, null],
 [ 9, 10,  null, null],
 [ 7,  6,  10,   null],
 [ 4,  1,   8,    3 ]
]

 */
