package RecursionLearning.ArraysRecusion;

public class CHecksortREcc {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,9,4};

        boolean check=RecFunc(arr,0);
        System.out.println(check);
    }

    public static boolean RecFunc(int[] arr,int a)
    {


        if(a==arr.length-1)
        {
            return true;
        }
        if(arr[a]>arr[a+1])
        {
            return false;
        }


       return RecFunc(arr,a+1);


    }

}
