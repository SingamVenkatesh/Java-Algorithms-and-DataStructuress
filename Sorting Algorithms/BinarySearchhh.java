package SORTINGALGORTIHMSPRACTICE;

public class BinarySearchhh {
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int target=9;
        int ans=SearchNormal(arr,target);
        System.out.println(ans);
        int answer=SearchUsiingREc(arr,target,0,arr.length);
        System.out.println("this is using recusrion : " +  answer);

    }
    public static int SearchUsiingREc(int[] arr,int target,int start,int end)
    {
        if (start > end) {
            return -1;  // target not found
        }
        int mid =start+(end-start)/2;

        if(arr[mid]> target)
        {
            return SearchUsiingREc(arr,target,start,mid-1);
        }
        else if(arr[mid] < target)
        {
            return SearchUsiingREc(arr,target,mid+1,end);
        }
        else
        {
            return mid;
        }
    }











    public static int SearchNormal(int[] arr,int target)
    {
        int s=0;
        int e=arr.length-1;
        while(s<=e)
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
