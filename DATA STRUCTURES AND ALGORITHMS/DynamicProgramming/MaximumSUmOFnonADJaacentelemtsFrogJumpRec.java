package RecursionLearning.DynamicProgramming;

import java.util.Arrays;

public class MaximumSUmOFnonADJaacentelemtsFrogJumpRec {

    public static void main(String[] args) {

        int arr[]={2,1,4,9};
        int n=arr.length-1;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        int result=FunViaREc(arr,n);
        System.out.println("This is using Recustion " + result);

      //  int res=FUnViaDP(n,arr,dp);
        //System.out.println("THis ans using Dynamic Programing " +res);

    }

    private static int FunViaREc(int[] arr, int n) {
        if(n==0)
        {
            return arr[0];
        }
        if(n<0)
        {
            return 0;
        }
        int pick=arr[n]+FunViaREc(arr,n-2);
        int nonpick=FunViaREc(arr,n-1);
        return Math.max(pick,nonpick);
    }



    static  int FUnViaDP(int n,int[] arr,int[] dp)
    {

        if(n==0)
        {
            return arr[0];
        }
        if(n<0)
        {
            return 0;
        }
        if(dp[n]!=-1)
        {
            return dp[n];
        }

        int pick=arr[n]+FUnViaDP(n-2,arr,dp);
        int nonpick=FUnViaDP(n-1,arr,dp);

        return arr[n]=Math.max(pick,nonpick);


    }

}
