package CognizantQuestIOns;

import java.util.Arrays;

public class SelectioonSORT {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        for(int i=0;i<arr.length;i++)
        {

            int last=arr.length-i-1;

            int MaxIndex=getMaxIndext(arr,0,last);

            Swap(arr,MaxIndex,last);
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void Swap(int[] arr, int f, int l)
    {
        int temp=arr[f];
        arr[f]=arr[l];
        arr[l]=temp;
    }

    private static int getMaxIndext(int[] arr, int i, int last)
    {
        int max=i;

        for(int j=0;j<=last;j++)
        {
            if(arr[max]<arr[j])
            {
                max=j;
            }
        }
        return max;

    }
}
