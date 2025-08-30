package RecursionProblemssSynopisPreparation.HASHMAP;
import java.util.Arrays;
import java.util.HashMap;
public class PairingProblem
{
    public static void main(String[] args)
    {
        /*
        You are given an integer array nums consisting of 2 * n integers.
You need to divide nums into n pairs such that:
Each element belongs to exactly one pair.
The elements present in a pair are equal.
Return true if nums can be divided into n pairs, otherwise return false.
Example 1:
Input: nums = [3,2,3,2,2,2]
Output: true
Explanation:
There are 6 elements in nums, so they should be divided into 6 / 2 = 3 pairs.
If nums is divided into the pairs (2, 2), (3, 3), and (2, 2), it will satisfy all the conditions.
     example 2 : nums[]={1,2,4,4,1}; // false
         */
        int[] nums={3,2,3,2,2,2};

        boolean ans=PariringSum(nums);
        System.out.println(ans);

        boolean result=PariringSum2(nums);
        System.out.println(result);

    }
    public static boolean PariringSum(int[] nums)
    {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int value:nums)
        {
            map.put(value,map.getOrDefault(value,0) +1);
        }

        for(int countValue: map.values())
        {
            if(countValue %2 !=0)
            {
                return false;
            }
        }
        return true;
        // here with num[3,2,3,2,2,2]  here frequency count = {3=2,2=4 }; so true

    }


    public static boolean PariringSum2(int[] nums)
    {

        Arrays.sort(nums);
        for(int i=0;i<nums.length;i +=2)
        {
            if(nums[i]!=nums[i+1])
            {
                return false;

            }

        }
        return true;

    }

}

