package RecursionProblemssSynopisPreparation.DYNAMICPROGRAMMING.HouseRobberPRoblem;

public class HouseRobberLeetCode213
{
    public static void main(String[] args)
    {
        //Input: nums = [1,2,3,1]
      //  Output: 4

        int nums[]={1,2,3,1};
        int ans=HouseRobberr(nums);
        System.out.println(ans);
    }
    private static int HouseRobberr(int[] nums)
    {
        /* here we need to first consider first element and not last then
       after we need to skip first element and we neeed to calculate
        so we need to create 2 arrays like one array with skippping the first and other array
        with skiping the last

        if we choose to take first element then you cant choose last
        if we skip first then take last element
         */
        if(nums.length<2)
        {
            return nums[0];
        }

        int[] skipLastHouse=new int[nums.length-1];
        int[] skipFirstHouse=new int[nums.length-1];
        for(int i=0;i<nums.length-1;i++)
        {
            skipLastHouse[i]=nums[i];
            skipFirstHouse[i]=nums[i+1];
        }
        int first=helper(skipLastHouse);
        int last=helper(skipFirstHouse);
        return Math.max(first,last);

    }



    public static int helper(int[] numss)
    {
        int[] dp=new int[numss.length];
        dp[0]=numss[0];
        dp[1]=Math.max(numss[0],numss[1]);
        for(int i=2;i<numss.length;i++)
        {
            dp[i]=Math.max(dp[i-2]+numss[i],dp[i-1]);
        }
        return dp[numss.length-1];
    }
}

