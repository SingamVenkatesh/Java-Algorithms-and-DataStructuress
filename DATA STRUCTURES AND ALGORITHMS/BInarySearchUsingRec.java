package RecursionLearning;

public class BInarySearchUsingRec {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int target=0;


        int ans=BinarySEarch(arr,target,0,arr.length-1);
        System.out.println(ans);

    }
    public static int BinarySEarch(int[] arr, int target,int s,int e)
    {

        int mid=s+(e-s)/2;
        if(s>e)
            {
              return -1;
             }
        if(arr[mid]==target)
              {
                  return mid;
              }
        if(target<arr[mid])
        {

            return BinarySEarch(arr,target,s,mid-1);
        }

            return BinarySEarch(arr, target, mid + 1, e);

    }

}
