package RecursionLearning.DynamicProgramming;

import java.util.Arrays;

public class FrogJumpProblemRec {
    public static void main(String[] args) {
        // heights = [10, 100, 30, 20, 50, 80, 40]  ouptut: 60
        int heights[] = {30,10,60,10,60,50};
        int n = heights.length;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        int ans = FrogJumpRecursionDP(heights, n - 1, dp);
     //   System.out.println("this solution is uind DP(Momization) " +ans);
        System.out.println(FrogJumpRecursion(heights,n-1));
    }
    private static int FrogJumpRecursionDP(int[] heights, int n, int[] dp) {
        if (n == 0) {
            return 0;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        int left = FrogJumpRecursionDP(heights, n - 1, dp) + Math.abs(heights[n] - heights[n - 1]);
        int right=Integer.MAX_VALUE;
        if(n>1) {
            right = (n > 1) ? FrogJumpRecursionDP(heights, n - 2, dp) + Math.abs(heights[n] - heights[n - 2]) : Integer.MAX_VALUE;
        }
         dp[n] = Math.min(left, right);
        return dp[n];
    }



        private static int FrogJumpRecursion(int[] heights, int index) {
            if (index == 0) return 0; // Base case: No energy needed at the first stone
            // One-step jump
            int left = FrogJumpRecursion(heights, index - 1) + Math.abs(heights[index] - heights[index - 1]);
            // Two-step jump (Only if index > 1)
            int right=Integer.MAX_VALUE;
          if(index>1)
          {
             right= FrogJumpRecursion(heights, index - 2) + Math.abs(heights[index] - heights[index - 2]);
          }
            return Math.min(left, right);
        }
    }



