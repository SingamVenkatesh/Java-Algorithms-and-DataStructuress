package RecursionProblemssSynopisPreparation;
import java.util.Arrays;
public class ReverseAnArray {
    public static void main(String[] args)
    {
        int[] arr={5,4,3,2,1};
        int length=arr.length-1;
       int ans[]= Reversee(arr,0,length);
        System.out.println(Arrays.toString(ans));
    }
    private static int[] Reversee(int[] arr,int start,int end)
    {

        if(start>=end)
        {
            return arr;
        }


            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

       return Reversee(arr,start+1,end-1);

    }
}
