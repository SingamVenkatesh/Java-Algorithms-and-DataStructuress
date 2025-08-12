package CODINGQUESTIONS;

import java.util.Arrays;

public class LeetcodeProblem34
{
    public static void main(String[] args)
    {

        int nums[]={5,7,7,8,8,10};
        int  target = 8;
        int[] arr=searchRange(nums,target);
        System.out.println(Arrays.toString(arr));

    }
       //
       // int[] arr=new int[2];
        public static int[] searchRange(int[] nums, int target)
        {

            int first = findFirst(nums, target);
            int last = findLast(nums, target);
            return new int[]{first, last};
        }

        private static int findFirst(int[] nums, int target) {
            int left = 0, right = nums.length - 1;
            int result = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] == target) {
                    result = mid;
                    right = mid - 1; // keep going left
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return result;
        }

        private static int findLast(int[] nums, int target) {
            int left = 0, right = nums.length - 1;
            int result = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] == target) {
                    result = mid;
                    left = mid + 1; // keep going right
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return result;
        }





        public static int SeondOccu(int[] nums, int target)
        {
            System.out.println(Arrays.toString(nums));
            int s=0;
            int e=nums.length-1;
            while(s<=e)
            {
                int mid = s+ (e- s) / 2;
                if(nums[mid]>target)
                {
                    e=mid-1;
                }
                else if(nums[mid]<target)
                {
                    s=mid+1;
                }
                else
                {

                    return mid;
                }

            }

            return -1;

        }
    }

