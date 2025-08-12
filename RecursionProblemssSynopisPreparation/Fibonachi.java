package RecursionProblemssSynopisPreparation;

public class Fibonachi {
    public static void main(String[] args) {
        //0 1 1 2 3 5 8 13 21
        //0 1 2 3 4 5 6 7  8
      int ans=  Fibbo(8);
        System.out.println(ans);
    }

    private static int Fibbo(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        return Fibbo(n-1) + Fibbo(n-2);
    }
}
