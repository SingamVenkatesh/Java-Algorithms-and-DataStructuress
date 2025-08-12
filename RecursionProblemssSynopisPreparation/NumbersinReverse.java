package RecursionProblemssSynopisPreparation;

public class NumbersinReverse {
    public static void main(String[] args) {

        Prinntt(10);
        NextFun(0,3);

    }
    private static void NextFun(int i, int i1)
    {
        if(i>3)
        {
            return;
        }
        i++;

        NextFun(i,i1);
        System.out.println(i);

    }

    private static void Prinntt(int i)
    {

        if(i<0)
        {
            return;
        }
        System.out.println(i);
        Prinntt(i-1);
        System.out.println(i);



    }
}
