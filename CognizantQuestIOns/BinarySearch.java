package CognizantQuestIOns;

public class BinarySearch {
    public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7,8,9,10};
    int target=1;

    int ans=BIInarySeaRcchh(arr,target);
        System.out.println(ans);

    }
    private static int BIInarySeaRcchh(int[] arr, int target) {
        int s=0;
        int e=arr.length-1;


        while (s<=e)
        {
            int mid=s+(e-s)/2;

            if(arr[mid]<target)
            {
                s=mid+1;
            }
            else if(arr[mid]>target)
            {
                e=mid-1;

            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
