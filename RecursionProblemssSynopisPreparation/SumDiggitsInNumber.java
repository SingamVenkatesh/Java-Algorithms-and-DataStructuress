package RecursionProblemssSynopisPreparation;

public class SumDiggitsInNumber {

    public static void main(String[] args) {
        int num=12345;

        int ans=SumDigit(num);
        System.out.println(ans);
    }

    private static int SumDigit(int num)
    {
        if(num<=0)
        {
            return num;
        }

        return num%10 + SumDigit(num/10);
    }
}
