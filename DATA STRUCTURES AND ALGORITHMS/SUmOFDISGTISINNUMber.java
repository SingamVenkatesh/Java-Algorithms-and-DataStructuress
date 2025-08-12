package RecursionLearning;

public class SUmOFDISGTISINNUMber {
    public static void main(String[] args) {
        int n=123;
        System.out.println(SumOF(n));
    }
    public static int SumOF(int n)
    {
       if(n==0)
         {
               return 0;
         }

       return n%10 + SumOF(n/10);
    }
}
