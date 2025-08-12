package RecursionLearning.DynamicProgramming;

public class Factorialllllll {
    public static void main(String[] args) {
        int n=5;
        int ans=Fun(n);
        System.out.println(ans);
    }

    private static int Fun(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n*Fun(n-1);
    }
}
