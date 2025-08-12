package RecursionLearning.ArraysRecusion;

import java.util.Arrays;

public class problem {
    public static void main(String[] args) {
        int arr[]={0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1};
        // anser [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]

        int left=0;int right=arr.length-1;
        while(left<right)
        {
            if(arr[left]==0)
            {
                left++;
            }
            else if(arr[right]==1)
            {
                right--;
            }
            else
            {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }

        System.out.println(Arrays.toString(arr));





        /*
        int ans[]=new int[arr.length];

        int zerocount=0;
        int onesCOunt=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {

                zerocount=zerocount+1;
            }
            else
            {
                onesCOunt=onesCOunt+1;
            }
        }
        System.out.println("zero count " + zerocount);
        int m=zerocount;
        for(int j=0;j<arr.length;j++)
        {
            int k=0;

                if(arr[j]==0)
                {
                    ans[k++]=0;
                }
            else
            {
                ans[m++]=1;
            }
        }
        System.out.println(Arrays.toString(ans));
        */

    }
}
