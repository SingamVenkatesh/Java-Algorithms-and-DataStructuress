package RecursionLearning;

public class SumOFnNuumbrs {

    public static void main(String[] args) {
        int n=4;
      int ans= SUMM(n);
        System.out.println(ans);

    }

    public static int SUMM(int n)
    {

        if(n==1)
        {
            return n;
        }

        return n+SUMM(n-1);
    }


}
