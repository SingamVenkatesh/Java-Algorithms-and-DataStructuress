package SORTINGALGORTIHMSPRACTICE;

import java.util.Arrays;

public class QuickSorttt {

    public static void main(String[] args)
    {
        int[] arr={5,4,3,2,1};
        QuiickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    public static void QuiickSort(int[] arr,int low,int high)
    {
        if (low >= high) {
            return;
        }
        int s=low;
        int e=high;
        int mid=s+(e -s)/2;
        int pivot=arr[mid];
        while (s<=e)
        {
            while (arr[s]<pivot)
            {
                s++;
            }
            while(arr[e]>pivot)
            {
                e--;
            }
            if(s<=e)
            {
                // then swap
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        QuiickSort(arr,low,e);
        QuiickSort(arr,s,high);

    }

}
