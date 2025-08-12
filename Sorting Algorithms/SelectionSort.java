package SORTINGALGORTIHMSPRACTICE;
import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,3,2,1};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void SelectionSort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int last=arr.length-i-1;
           int maxIndex= getMaxIndex(arr,0,last);

           swap(arr,maxIndex,last);

        }
    }
    public static void swap(int arr[],int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    private static int getMaxIndex(int[] arr,int start,int end)
    {
        int max=start;
        for(int i=start;i<=end;i++)
        {
            if(arr[max]<arr[i])
            {
                max=i;
            }
        }
        return max;
    }
}
