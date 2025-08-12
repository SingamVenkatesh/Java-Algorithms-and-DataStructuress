package RecursionLearning.DynamicProgramming;
import java.util.Arrays;
// this is uisng top down apprach(memoization) in dynamic programming
public class FiboUsingDP {
    static int[] arr;
    public static void main(String[] args) {
        int n = 3;
        arr = new int[n + 1];
        Arrays.fill(arr, -1); // fills array with -1
        int ans = Fibo(n);
        System.out.println(ans);
        System.out.println(Arrays.toString(arr));
    }
    public static int Fibo(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        if(arr[n]!=-1)
        {
            return arr[n];
        }
        arr[n]=Fibo(n-1)+ Fibo(n-2);

        return arr[n];
    }
}
