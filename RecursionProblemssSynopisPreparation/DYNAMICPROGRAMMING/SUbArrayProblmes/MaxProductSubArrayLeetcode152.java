package RecursionProblemssSynopisPreparation.DYNAMICPROGRAMMING.SUbArrayProblmes;

import java.util.Arrays;

public class MaxProductSubArrayLeetcode152
{
    public static void main(String[] args)
    {
        /*
        Example 1:
Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:
Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
         */
        //int nums[]={2,3,-2,4};
        int nums[] = {-2, -3, -30, -2, 0, -5, -6, -1, -4, -9, -9};
        int proudct=maxProduct(nums);
        System.out.println(proudct);


     //   int numss[]= {4,6,9,-2,0,-8,-9,12};
       int  numss[] = {2, 3, -2, 4};

        int product_Dp= maxProductUisngDP(numss);
        System.out.println(product_Dp);
    }

    public static int maxProduct(int[] nums)
    {

        int n = nums.length;
        long leftProduct = 1;
        long rightProduct = 1;
        long ans = nums[0];
        for (int i = 0; i < n; i++)
        {
            //if any of leftProduct or rightProduct become 0 then update it to 1

            if(leftProduct==0 || leftProduct < Integer.MIN_VALUE)
            {
                leftProduct=1;
            }
            if(rightProduct==0 || rightProduct < Integer.MIN_VALUE)
            {
                rightProduct=1;
            }
            //prefix product
            leftProduct *= nums[i];

            //suffix product
            rightProduct *= nums[n - 1 - i];

            ans = Math.max(ans, Math.max(leftProduct, rightProduct));
        }

        return (int) ans;
    }

        public static int maxProductUisngDP(int[] nums)
        {
            System.out.println("Belwo anaswer is using DP");
            int n = nums.length;
            int[] dpMax = new int[n];
            int[] dpMin = new int[n];

            dpMax[0] = nums[0];
            dpMin[0] = nums[0];
            int ans = nums[0];

            for (int i = 1; i < n; i++) {
                if (nums[i] < 0) {
                    // Swap because multiplying a negative with min may become max
                    int temp = dpMax[i - 1];
                    dpMax[i - 1] = dpMin[i - 1];
                    dpMin[i - 1] = temp;
                }

                dpMax[i] = Math.max(nums[i], nums[i] * dpMax[i - 1]);
                dpMin[i] = Math.min(nums[i], nums[i] * dpMin[i - 1]);

                ans = Math.max(ans, dpMax[i]);
            }

            System.out.println(Arrays.toString(dpMax));
            System.out.println(Arrays.toString(dpMin));


            return ans;
        }
    }





