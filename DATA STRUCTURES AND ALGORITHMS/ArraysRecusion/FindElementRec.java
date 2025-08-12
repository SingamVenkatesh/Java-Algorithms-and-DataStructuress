package RecursionLearning.ArraysRecusion;

public class FindElementRec {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int target=5;


      int ans= FuncRec(arr,target,0);
        System.out.println(ans);
    }


    public static int FuncRec(int[] arr,int target,int a)
    {

        if(a==arr.length)
        {
            return -1;
        }
        if(arr[a]==target)
        {
            return a;
        }

        return FuncRec(arr,target,a+1);


    }


}
