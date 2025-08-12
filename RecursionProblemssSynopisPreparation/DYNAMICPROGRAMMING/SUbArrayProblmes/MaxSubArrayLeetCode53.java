package RecursionProblemssSynopisPreparation.DYNAMICPROGRAMMING.SUbArrayProblmes;

import java.util.Arrays;

public class MaxSubArrayLeetCode53
{
    /*
    Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
     */
    public static void main(String[] args)
    {
     //  int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        int[] nums={-4,-2,-1,10,20,30,-4,-6,-8,80,90,100};
      // int ans= SubArrayy(nums);
      //  System.out.println(ans);
        int ansdp=MaxSubArrayDPsolution(nums);
        System.out.println(ansdp);


    }

    private static int MaxSubArrayDPsolution(int[] nums)
    {


        int n=nums.length;
        int[] dp=new int[n];
        dp[0]=nums[0];
        int masSum=nums[0];
        for(int i=1;i<nums.length;i++)
        {

            dp[i]=Math.max(nums[i],dp[i-1]+nums[i]);
            masSum=Math.max(masSum,dp[i]);

        }
        System.out.println(Arrays.toString(dp));

        Arrays.sort(dp);
        return dp[dp.length-1];
      //  return masSum;
    }



    private static int SubArrayy(int[] nums)
    {
        int current_Sum=nums[0];
        int max_Sum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            current_Sum=Math.max(nums[i],current_Sum+nums[i]);
            max_Sum=Math.max(max_Sum,current_Sum);

        }
        return  max_Sum;
    }
}
