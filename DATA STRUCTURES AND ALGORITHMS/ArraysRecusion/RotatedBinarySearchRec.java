package RecursionLearning.ArraysRecusion;
public class RotatedBinarySearchRec
{
    public static void main(String[] args) {
        int arr[]={5,6,7,8,9,1,2,3,4};
        int target=9;
        int ans=  SEarch(arr,target,0,arr.length-1);
        System.out.println(ans);
    }
    public static int SEarch(int[] arr, int target, int s, int e)
    {
        if(s>e)
        {
            return -1;
        }
        int mid=s+(e-s)/2;
        if(arr[mid]==target)
        {
            return mid;
        }
        if(arr[s]<=arr[mid])
        {
            if(target>=arr[s] && target<=arr[mid])
            {
                return SEarch(arr,target,s,mid-1);
            }
            else
            {
                return SEarch(arr,target,mid+1,e);
            }
        }

        if(target>=arr[mid] && target<=arr[e])
        {
            return SEarch(arr,target,mid+1,e);
        }
         return SEarch(arr,target,s,mid-1);
    }
}
