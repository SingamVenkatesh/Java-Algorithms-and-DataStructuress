package RecursionLearning.DynamicProgramming;



/*
Problem Statement
Given an array of N integers and a target sum S, find the number of subsets whose sum is equal to S.

Example
Input
text
Copy
Edit
arr = [2, 3, 5, 6, 8, 10]
sum = 10
Output
text
Copy
Edit
Count of subsets = 3
Explanation
The valid subsets are:

{2, 3, 5}
{10}
{2, 8}
Approach: Dynamic Programming
We use a DP table where dp[i][j] represents the number of subsets that sum up to j using the first i elements.
State Transition:
If we don’t take the current element: dp[i][j] = dp[i-1][j]
If we take the current element: dp[i][j] += dp[i-1][j - arr[i-1]] (only if j >= arr[i-1])
Steps
Initialize DP table dp[n+1][sum+1]:
dp[0][0] = 1 (empty subset for sum 0).
dp[i][0] = 1 for all i (one way to get sum 0 → by taking no elements).
dp[0][j] = 0 for j > 0 (zero elements can't form a positive sum).
Fill DP table using the transition formula.
Return dp[n][sum], which gives the count of subsets.

 */
public class COuntSUmofSubsetsforGivensum {
    public static int countSubsets(int[] arr, int sum) {
        int n = arr.length;
        int[][] dp = new int[n + 1][sum + 1];

        // Base case: If sum is 0, there's one subset (empty set)
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        // Fill the DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                // Exclude the current element
                dp[i][j] = dp[i - 1][j];

                // Include the current element if it's not greater than the sum
                if (arr[i - 1] <= j) {
                    dp[i][j] += dp[i - 1][j - arr[i - 1]];
                }
            }
        }

        return dp[n][sum];
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 8, 10};
        int sum = 10;
        System.out.println("Count of subsets: " + countSubsets(arr, sum)); // Output: 3
    }
}

