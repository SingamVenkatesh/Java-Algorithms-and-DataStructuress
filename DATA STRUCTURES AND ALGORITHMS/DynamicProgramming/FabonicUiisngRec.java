package RecursionLearning.DynamicProgramming;

public class FabonicUiisngRec {
    public static void main(String[] args) {

        int n=5;

      int ans=  Fibo(n);
        System.out.println(ans);
    }

    public static int Fibo(int n)

    {
        if(n==0||n==1)
        {
            return n;
        }

        return Fibo(n-1) +Fibo(n-2);

    }

}
