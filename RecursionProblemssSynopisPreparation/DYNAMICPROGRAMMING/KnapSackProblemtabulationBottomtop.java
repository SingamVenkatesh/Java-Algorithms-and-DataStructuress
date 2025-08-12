package RecursionProblemssSynopisPreparation.DYNAMICPROGRAMMING;

public class KnapSackProblemtabulationBottomtop {
    public static void main(String[] args) {

        int[] weights = {2, 3, 4, 5};
        int[] values = {3, 4, 5, 6};
        int W = 5;
        int MaxProfit = KnapSackk(weights, values, W);
        System.out.println("Maximum Profit: " + MaxProfit);
    }

    private static int KnapSackk(int[] weights, int[] values, int W) {
        int n = weights.length;
        int[][] dp = new int[n + 1][W + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= W; j++) {
                if (weights[i - 1] <= j) {
                    // Use current weight j (not total W)
                    dp[i][j] = Math.max(values[i - 1] + dp[i - 1][j - weights[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        // Optional: print the DP table
        System.out.println("DP Table:");
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= W; j++) {
                System.out.print(dp[i][j] + "\t");
            }
            System.out.println();
        }

        return dp[n][W];
    }
}
