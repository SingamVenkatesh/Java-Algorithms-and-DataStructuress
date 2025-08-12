package RecursionLearning;
import java.util.Arrays;
public class Bubblesorttt {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1,0};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void Sort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }



}
