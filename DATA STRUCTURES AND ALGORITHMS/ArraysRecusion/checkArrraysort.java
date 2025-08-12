package RecursionLearning.ArraysRecusion;

public class checkArrraysort {
    public static void main(String[] args) {
        int arr[]={1,1,2,3,4,5,6,100,7};

        boolean check=Func(arr);
        System.out.println(check);
    }

    public static boolean Func(int[] arr)
    {

        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                return false;
            }
        }
        return true;
    }
}
