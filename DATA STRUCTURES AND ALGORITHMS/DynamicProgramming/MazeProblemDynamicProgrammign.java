package RecursionLearning.DynamicProgramming;

import java.util.Arrays;

public class MazeProblemDynamicProgrammign
{
    public static void main(String[] args)
    {
        int r=3,c=3;
        System.out.println(CountUsingREC(3,3));// for recusrion
        dp=new int[r+1][c+1];
        for(int[] row:dp)
        {
            Arrays.fill(row,-1);
        }
       System.out.println("THis is using MEmoization" +CountMemoization(r,c));
       System.out.println(Arrays.deepToString(dp));

        System.out.println("This is using Tabulation   " + countUsingTabulation(r,c));

    }

    private static int CountUsingREC(int r, int c)
    {
        if(r==1||c==1)
        {
            return 1;
        }
        int left=CountUsingREC(r-1,c);
        int right=CountUsingREC(r,c-1);
        return left+right;
    }




     // using memoization Dynamic Programming
     static int[][] dp;

    public static int CountMemoization(int r,int c)
    {
        if(r==1||c==1)
        {
            return 1;
        }
        if(dp[r][c]!=-1)
        {
            return dp[r][c];
        }
        dp[r][c]=CountMemoization(r-1,c)+CountMemoization(r,c-1);
        return dp[r][c];
    }




    // using Tabulation method



        public static int countUsingTabulation(int r, int c)
        {
        int dpp[][] = new int[r][c];

        // Initialize first row and first column with 1 (only one way to move)
        for (int i = 0; i < r; i++) {
            dpp[i][0] = 1;
        }
        for (int j = 0; j < c; j++) {
            dpp[0][j] = 1;
        }

        // Fill the DP table using bottom-up approach
        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                dpp[i][j] = dpp[i - 1][j] + dpp[i][j - 1]; // Correct formula
            }
        }
            System.out.println(Arrays.deepToString(dpp));
        return dpp[r - 1][c - 1]; // The final answer at bottom-right cell
    }


}
