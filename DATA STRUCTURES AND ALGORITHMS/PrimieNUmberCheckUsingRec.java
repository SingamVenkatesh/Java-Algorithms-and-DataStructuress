package RecursionLearning;

public class PrimieNUmberCheckUsingRec {

    public static void main(String[] args) {

       boolean ans= PrimeCheck(8,2);
        System.out.println(ans);


    }
    public static boolean PrimeCheck(int n,int divisor)
    {

         if(n<2)
         {
             return false;
         }

         if(divisor*divisor>n)
         {
             return true;
         }
        if(n%divisor==0)
        {
           return false;
        }

      return PrimeCheck(n,divisor+1);


    }


}
