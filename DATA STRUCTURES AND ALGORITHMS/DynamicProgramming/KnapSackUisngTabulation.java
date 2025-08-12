package RecursionLearning.DynamicProgramming;

import java.sql.SQLOutput;
import java.util.Arrays;

public class KnapSackUisngTabulation {
    public static void main(String[] args) {
        int[] val={60,100,120,900};
        int[] wt={10,20,30,10};
        int w=50;
        int n=val.length;
        System.out.println("Maximum value : " + KnapSacKDP(val,wt,w,n));
    }
    private static int KnapSacKDP(int[] val, int[] wt, int w, int n) {
         int[][] dp=new int[n+1][w+1];
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<=w;j++)
            {
                if(wt[i-1]<=j)
                {
                    dp[i][j]=Math.max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(dp));
               return dp[n][w];
    }
}
