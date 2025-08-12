package RecursionLearning.DynamicProgramming;

import java.util.Arrays;

public class SubsetSumOWNandEqualsUmpartion {

    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 1};
        int target = 4;
        int n = arr.length;

        // Subset Sum Problem using Recursion
        boolean subsetAns = SubsetViaRec(n - 1, target, arr);
        System.out.println("Subset Sum via Recursion: " + subsetAns);

        // DP Table Initialization
        int dp[][] = new int[n][target + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        // Subset Sum Problem using Dynamic Programming
        boolean DPans = SubSetViaDP(n - 1, target, arr, dp);
        System.out.println("Subset Sum via DP: " + DPans);

        // Equal Sum Partition Problem
        int nums[] = {1, 5, 11, 5}; // Example test case
        boolean equalSumPartitionAns = EqualSumPartition(nums);
        System.out.println("Equal Sum Partition Possible: " + equalSumPartitionAns);
    }

    public static boolean EqualSumPartition(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        // If total sum is odd, we can't partition it equally
        if (totalSum % 2 != 0) {
            return false;
        }

        int n = arr.length;
        int target = totalSum / 2;
        int[][] dp = new int[n][target + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return SubSetViaDP(n - 1, target, arr, dp);
    }

    private static boolean SubsetViaRec(int n, int target, int[] arr) {
        if (target == 0) {
            return true;
        }
        if (n < 0) {
            return false;
        }

        boolean notTaken = SubsetViaRec(n - 1, target, arr);

        boolean taken = false;
        if (arr[n] <= target) {  // ✅ Fixed Indexing (should be arr[n-1])
            taken = SubsetViaRec(n - 1, target - arr[n], arr);
        }

        return taken || notTaken;
    }

    private static boolean SubSetViaDP(int n, int target, int[] arr, int[][] dp) {
        if (target == 0) {
            return true;
        }
        if (n < 0) {
            return false;
        }
        if (dp[n][target] != -1) {
            return dp[n][target] == 1;
        }

        boolean notTaken = SubSetViaDP(n - 1, target, arr, dp);

        boolean taken = false;
        if (arr[n] <= target) { // ✅ Fixed Indexing (should be arr[n-1])
            taken = SubSetViaDP(n - 1, target - arr[n], arr, dp);
        }

        dp[n][target] = (taken || notTaken) ? 1 : 0;
        return taken || notTaken;
    }
}
