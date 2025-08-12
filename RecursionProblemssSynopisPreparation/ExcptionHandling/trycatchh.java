package RecursionProblemssSynopisPreparation.ExcptionHandling;

public class trycatchh {
    public static void main(String[] args) {

        try {
            int ans=10/0;
            System.out.println(ans);
        }
        catch (ArithmeticException e)
        {
            //e.printStackTrace();
            e.getMessage();
        }
    }
}
