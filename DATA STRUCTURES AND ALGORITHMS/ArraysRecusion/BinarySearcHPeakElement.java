package RecursionLearning.ArraysRecusion;

public class BinarySearcHPeakElement {
    // here find the maximum element in the sorted binary search array
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 6, 4, 2};

        int left=0;
        int right=arr.length;
        while(left<right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]>arr[mid+1])
            {
                right=mid;
            }
            else
            {
               left=mid+1;
            }
        }
        System.out.println(arr[left]);


    }
}
