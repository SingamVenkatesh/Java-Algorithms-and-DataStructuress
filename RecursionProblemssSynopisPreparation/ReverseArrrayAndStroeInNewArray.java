package RecursionProblemssSynopisPreparation;

import java.util.Arrays;

public class ReverseArrrayAndStroeInNewArray {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};

        int[] ans=new int[arr.length];

        ReverseArray(arr,ans,0);
        System.out.println(Arrays.toString(ans));
    }

    private static void ReverseArray(int[] arr, int[] ans, int index) {
        if (index >= arr.length) {
            return;
        }
        ans[index] = arr[arr.length - 1 - index];
        ReverseArray(arr, ans, index + 1);
    }

}
