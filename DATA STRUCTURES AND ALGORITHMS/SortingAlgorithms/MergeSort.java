package RecursionLearning.SortingAlgorithms;
import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args) {
       // int[] arr = {4, 3, 2, 1};
        int[] arr={6,5,4,3,2,1};
        int[] ans = MergeSortt(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] MergeSortt(int nums[])

    {

        if(nums.length==1)
        {
            return nums;
        }
        int mid=nums.length/2;
        int left[]=MergeSortt(Arrays.copyOfRange(nums,0,mid)); // here 0 is inclusive and mid is exclusive
        int right[]=MergeSortt(Arrays.copyOfRange(nums,mid,nums.length));
        return merge(left,right);

    }

    public static int[] merge(int[] first,int[] second)
    {
        int[] mix=new int[first.length+second.length];
        int i=0,j=0,k=0;

        while(i<first.length && j<second.length)
        {
            if(first[i]<second[j])
            {
                mix[k]=first[i];
                i++;

            }
            else
            {
                mix[k]=second[j];
                j++;

            }
            k++;
        }


        while(i<first.length)
        {
            mix[k]=first[i];
            i++;
            k++;
        }

        while(j<second.length)
        {
            mix[k]=second[j];
            k++;
            j++;
        }
        return mix;
    }
}