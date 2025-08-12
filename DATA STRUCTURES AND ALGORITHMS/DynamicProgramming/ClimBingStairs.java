package RecursionLearning.DynamicProgramming;
import java.util.Arrays;
public class ClimBingStairs {
    public static void main(String[] args) {
        int n=5;
      //  System.out.println(ClimStarUsingRec( n));
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println("this is usind DP " + ClimStairsUinsDPMemoization(n,dp));
        System.out.println("array after filling " + Arrays.toString(dp));
    }
    private static int ClimStarUsingRec(int n)
    {
        if(n==0)
        {
            return 1;
        }
        if(n<0)
        {
            return 0;
        }
        return ClimStarUsingRec(n-1)+ClimStarUsingRec(n-2);
    }
   public static int ClimStairsUinsDPMemoization(int n,int[] dp)
   {
       if(n==0)
       {
           return 1;
       }
       if(n<0)
       {
           return 0;
       }
       if(dp[n]!=-1)
       {
           return dp[n];
       }
       dp[n]=ClimStairsUinsDPMemoization(n-1,dp)+ClimStairsUinsDPMemoization(n-2,dp);
     //  System.out.println("singam");
       System.out.println(dp[n]);
       return dp[n];

       /*
       climbStairsUsingDPMemoization(5)
 ├── climbStairsUsingDPMemoization(4)
 │   ├── climbStairsUsingDPMemoization(3)
 │   │   ├── climbStairsUsingDPMemoization(2)
 │   │   │   ├── climbStairsUsingDPMemoization(1) → returns 1
 │   │   │   ├── climbStairsUsingDPMemoization(0) → returns 1
 │   │   │   └── dp[2] = 1+1 → returns 2
 │   │   ├── climbStairsUsingDPMemoization(1) → returns 1
 │   │   └── dp[3] = 2+1 → returns 3
 │   ├── climbStairsUsingDPMemoization(2) → returns **memoized 2**
 │   └── dp[4] = 3+2 → returns 5
 ├── climbStairsUsingDPMemoization(3) → returns **memoized 3**
 └── dp[5] = 5+3 → returns 8

        */


   }

















    /*
    Test Case 1
Input: n = 3
Output: 3
Explanation: There are 3 ways to reach step 3:

1 → 1 → 1
1 → 2
2 → 1
Test Case 2
Input: n = 5
Output: 8
Explanation: There are 8 ways to reach step 5:

1 → 1 → 1 → 1 → 1
1 → 1 → 1 → 2
1 → 1 → 2 → 1
1 → 2 → 1 → 1
2 → 1 → 1 → 1
1 → 2 → 2
2 → 1 → 2
2 → 2 → 1
Test Case 3
Input: n = 1
Output: 1
Explanation: Only one way: 1
     */
}
