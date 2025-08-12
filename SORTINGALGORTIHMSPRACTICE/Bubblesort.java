package SORTINGALGORTIHMSPRACTICE;

import java.util.Arrays;
public class Bubblesort {
    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,3,2,1};
        boolean swapped;
        for(int i=0;i<arr.length;i++)
        {
            swapped=false;
            for(int j=1;j<arr.length;j++)
            {
                if(arr[j-1]>arr[j])
                {
                    swapped=true;
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }

            }
            if(!swapped)
            {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
