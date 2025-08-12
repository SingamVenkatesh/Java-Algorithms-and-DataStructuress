package RecursionProblemssSynopisPreparation.SUBSETS;
public class PrimeOrNot {
    public static void main(String[] args) {
        int a=30;
//2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, and 97.

//Answer: The prime numbers from 1 to 100 are: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 8...

        boolean ans = primeNot(11);
        System.out.println(ans);
    }

    public static boolean primeNot(int a)
    {

        if(a==0 || a==1 || a==2)
        {
            return true;
        }

        for (int i=3;i<=Math.sqrt(a);i++)
        {
            if(a%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
