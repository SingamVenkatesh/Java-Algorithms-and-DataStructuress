package RecursionProblemssSynopisPreparation.DYNAMICPROGRAMMING;

import java.util.Arrays;

public class LongestCommonSubSwquenceLeetCode1143
{
    public static void main(String[] args)
    {
        String str1="abcdaf";
        String str2="acbcf";
       int ans=DpLongComnSubSequne(str1,str2);
        System.out.println(ans);
    }

    private static int DpLongComnSubSequne(String str1, String str2)
    {
        int[][] dp=new int[str1.length()+1][str2.length()+1];


        for(int i=1;i<=str1.length();i++)
        {

            for(int j=1;j<=str2.length();j++)
            {

              if(str1.charAt(i-1)==str2.charAt(j-1))
              {
                  dp[i][j]=1+dp[i-1][j-1];
              }else {
                  dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
              }

            }
        }
        System.out.println(Arrays.deepToString(dp));
        return dp[str1.length()][str2.length()];
    }
}
