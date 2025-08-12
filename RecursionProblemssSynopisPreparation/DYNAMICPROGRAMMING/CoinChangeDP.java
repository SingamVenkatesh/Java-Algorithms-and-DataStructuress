package RecursionProblemssSynopisPreparation.DYNAMICPROGRAMMING;

import java.util.ArrayList;
import java.util.Arrays;

public class CoinChangeDP
{
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;
        System.out.println("Minimum coins required: " + coinChange(coins, amount));
    }
    public static int coinChange(int[] coins, int amount)
    {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1); // Set to an impossible high value
        dp[0] = 0;

        for (int i = 1; i <= amount; i++)
        {
            for (int coin : coins)
            {
                if (coin <= i)
                {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
       // return dp[amount] > amount ? -1 : dp[amount];
        if(dp[amount]>amount)
        {
            return -1;
        }
        else
        {
            System.out.println(Arrays.toString(dp));
            return dp[amount];
        }
    }
}

