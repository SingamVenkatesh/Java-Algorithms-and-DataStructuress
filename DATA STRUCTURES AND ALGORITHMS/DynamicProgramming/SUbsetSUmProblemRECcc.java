package RecursionLearning.DynamicProgramming;

import java.util.Arrays;

public class SUbsetSUmProblemRECcc {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int targetSum=4;
        int n=arr.length;
        int[][] dp=new int[n+1][targetSum+1];
        for(int[] row:dp)
        {
            Arrays.fill(row,-1);
        }
        System.out.println(FUnViaRec(n,targetSum,arr));


      boolean ans=FunViaDymanicPrograming(n,targetSum,arr,dp);
        System.out.println("dp array" + Arrays.deepToString(dp));
      //  System.out.println("This is using Dynamic Programing   "+ ans);
    }

    private static boolean FUnViaRec(int n, int targetSum,int[] arr)
    {
        if(targetSum==0)
        {
            return true;
        }
        if(n==0)
        {
            return false;
        }
        boolean Taken=false;
        if(arr[n-1]<=targetSum)
        {
            Taken=FUnViaRec(n-1,targetSum-arr[n-1],arr);
        }
        boolean Nottaken=FUnViaRec(n-1,targetSum,arr);
        return Taken || Nottaken;
    }






    private static boolean FunViaDymanicPrograming(int n, int targetSum, int[] arr, int[][] dp)
    {
        if(targetSum==0)
        {
            return true;
        }
        if(n==0)
        {
            return arr[0]==targetSum;
        }
        if(dp[n][targetSum] !=-1)
        {
            return dp[n][targetSum]==1;

        }
        boolean NotTaken=FunViaDymanicPrograming(n-1,targetSum,arr,dp);

        boolean taken=false;
        if(arr[n-1]<=targetSum)
        {
            taken=FunViaDymanicPrograming(n-1,targetSum-arr[n-1],arr,dp);
        }
        dp[n][targetSum]=(taken || NotTaken)?1:0;
        return taken || NotTaken;
    }


}
