package RecursionProblemssSynopisPreparation.DYNAMICPROGRAMMING;

import java.util.Arrays;

public class ClimbingChairsMemoizationRec
{
    public static void main(String[] args)
    {
        int n = 4;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println("Ways to climb stairs (Memoization): " + climbStairs(n,dp));
        System.out.println(Arrays.toString(dp));
    }

    public static int climbStairs(int n,int[] dp)
    {
        if (n <= 2) return n;

        if (dp[n] != -1) {
            return dp[n];
        }
        dp[n] = climbStairs(n - 1, dp) + climbStairs(n - 2, dp);
        return dp[n];
    }


}
