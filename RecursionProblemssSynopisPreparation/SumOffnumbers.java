package RecursionProblemssSynopisPreparation;

public class SumOffnumbers {
    public static void main(String[] args) {
         int n=10;
       int ans= Summ(n);
       System.out.println(ans);
      //  System.out.println(n);
      //  SUMMM(10,0);
    }

    private static int Summ(int n)
    {
        System.out.println(n);
        if(n==1)
        {
            return 1;
        }
        return  n+Summ(n-1);
    }





    private static void SUMMM(int n, int sum)
    {

        if(n<1)
        {
            System.out.println(sum);
            return;
        }

        SUMMM(n-1,sum+n);
    }
}
