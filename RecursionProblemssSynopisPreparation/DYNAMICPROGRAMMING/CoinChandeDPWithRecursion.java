package RecursionProblemssSynopisPreparation.DYNAMICPROGRAMMING;

import java.util.Arrays;

 class CoinChangeDPWithRecursion {

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;

        int[] dp = new int[amount + 1];
        Arrays.fill(dp, -1);

        int ans = coinChangeRec(coins, amount, dp);

        System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);
    }

    private static int coinChangeRec(int[] coins, int amount, int[] dp) {
        if (amount == 0) return 0;
        if (amount < 0) return Integer.MAX_VALUE;

        if (dp[amount] != -1) return dp[amount];

        int min = Integer.MAX_VALUE;

        for (int coin : coins) {
            int res = coinChangeRec(coins, amount - coin, dp);
            if (res != Integer.MAX_VALUE) {
                min = Math.min(min, res + 1);
            }
        }

        dp[amount] = min;
        return dp[amount];
    }
}
