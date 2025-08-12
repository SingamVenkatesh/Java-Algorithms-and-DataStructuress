package RecursionLearning.DynamicProgramming;
import java.util.Arrays;
public class KnapsackWithDpMomization {
    static int[][]  dp;
    public static void main(String[] args)
    {
        int val[]={60,100,120};
        int wt[]={10,20,30};
        int w=50;
        int n=val.length;
        dp=new int[n+1][w+1];
        for (int[] row:dp)
        {
            Arrays.fill(row,-1);
        }
       System.out.println("Maximum value in Knapsack : " + knapsack(val,wt,w,n));
      //  System.out.println("this is using method" + Arrays.deepToString(dp));

       // System.out.println("length" + dp.length);

/*
        for (int[] row : dp) {

            System.out.println(Arrays.toString(row));
        }
*/
    }
    public static int knapsack(int[] val,int[] wt,int w,int n)
    {
        if(n==0|| w==0)
        {
            return 0;
        }
        if(dp[n][w]!=-1)
        {
            return dp[n][w];
        }
        if(wt[n-1]>w)
        {
            return dp[n][w]=knapsack(val,wt,w,n-1);
        }
        else
        {
          return dp[n][w]=Math.max(val[n-1]+knapsack(val,wt,w-wt[n-1],n-1),knapsack(val,wt,w,n-1));
        }
    }
}
