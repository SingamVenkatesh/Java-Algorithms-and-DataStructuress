package RecursionLearning.DynamicProgramming;

public class Fabo {

    public static void main(String[] args) {
        int n=5;

       int ans= fabonicc(n);
        System.out.println(ans);
    }

    private static int fabonicc(int n)
    {
        if(n==1|| n==0)
        {
            return n;
        }
        return fabonicc(n-1)+fabonicc(n-2);
    }
}
