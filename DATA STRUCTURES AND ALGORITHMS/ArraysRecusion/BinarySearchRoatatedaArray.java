package RecursionLearning.ArraysRecusion;

public class BinarySearchRoatatedaArray {

    public static void main(String[] args) {
       // int arr[]={4,5,6,7,0,1,2};// target=0; ans=4;
           int arr[]={1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8};


        int start=0;
        int end=arr.length-1;

        while(start<end)
        {

            int mid=start+(end-start)/2;


            if(arr[mid]>arr[mid+1]&& arr[mid]>arr[mid-1])
            {
                System.out.println(arr[mid]);
                break;
            }
           start++;
            end--;
        }

    }
}
