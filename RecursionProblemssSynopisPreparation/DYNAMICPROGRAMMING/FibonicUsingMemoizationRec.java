package RecursionProblemssSynopisPreparation.DYNAMICPROGRAMMING;

import java.util.Arrays;

public class FibonicUsingMemoizationRec
{
    public static void main(String[] args) {
        int number=6;
        int[] dp=new int[number+1];
        Arrays.fill(dp,-1);
        int ans=FiboUsingmemoization(number,dp);
        System.out.println(ans);
    }

    private static int FiboUsingmemoization(int number,int[] dp)
    {
        if(number<=1)
        {
            return number;
        }
        if(dp[number] !=-1)
        {
            return dp[number];
        }
        dp[number] =FiboUsingmemoization(number-1,dp) +FiboUsingmemoization(number-2,dp);

        System.out.println(Arrays.toString(dp));
        return dp[number];
    }
}
