package RecursionLearning.DynamicProgramming;

public class MaxSUmOFAdjacentwhere1standlastAlsoadjacent {
    public static void main(String[] args) {


int arr[]={2,1,4,9};
int n=arr.length-1;

      int ans=  FunViaREc(arr,n);
        System.out.println(ans);
    }
    private static int FunViaREc(int[] arr, int n) {
        if(n==0 || n<0)
        {
            return arr[1];
        }
        int pick=arr[n]+FunViaREc(arr,n-2);
        int nonpick=FunViaREc(arr,n-1);
        return Math.max(pick,nonpick);
    }
}
