package RecursionLearning;

public class BinarySearch
{
    public static void main(String args[])
    {

        int target=8;
        int[] nums={5, 7, 7, 8, 0, 10};
        int s=0;
        int e=nums.length;
        System.out.println(nums.length);
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

                System.out.println(mid);
                break;
            }

        }

    }

}

