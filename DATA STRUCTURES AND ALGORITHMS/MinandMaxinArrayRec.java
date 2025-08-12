package RecursionLearning;

import java.util.Arrays;

public class MinandMaxinArrayRec {

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, -5, -4, 8, 6};
        // Output: min = -5, max = 8

        function1(arr);
    }
    public static void function1(int[] arr) {
        VenkyFucntion(arr, 0);
    }

    public static void VenkyFucntion(int[] arr,int a)
    {


        if(arr[a]>arr[a+1])
        {
            int temp=arr[a];
            arr[a]=arr[a+1];
            arr[a+1]=temp;

        }
            VenkyFucntion(arr,a+1);

        System.out.println(Arrays.toString(arr));




    }
}
