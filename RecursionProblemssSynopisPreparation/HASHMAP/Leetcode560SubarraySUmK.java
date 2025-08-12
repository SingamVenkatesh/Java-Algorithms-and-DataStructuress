package RecursionProblemssSynopisPreparation.HASHMAP;

import java.util.HashMap;

public class Leetcode560SubarraySUmK
{
    public static void main(String[] args) {
        int[] arr={1,1,1};
        int k=2;

       // System.out.println(SubarrayK(arr,k));
        // using hashmap


        System.out.println(subarraySumUsingHashmap(arr,k));
    }

    public static int subarraySumUsingHashmap(int[] nums, int k) {
        int count = 0;
        int prefixSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        // Initialize with prefix sum = 0 occurred once
        map.put(0, 1);

        for (int num : nums) {
            prefixSum += num;

            // Check if there's a subarray sum ending here with sum == k
            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }

            // Update the frequency of current prefix sum
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }







    private static int SubarrayK(int[] arr,int k)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            int currentSum=0;
            for(int j=i;j<arr.length;j++)
            {
                currentSum +=arr[j];

                if(currentSum==k)
                {
                    count +=1;

                }
            }
        }
        return count;
    }
}
