package CognizantQuestIOns;

public class Factroial {
    public static void main(String[] args) {
        int a=5;
        int ans=1;
        for(int i=1;i<=5;i++)
        {
            ans =ans*i;
        }
        System.out.println(ans);
        System.out.println(FactREC(5));
    }



    public static int FactREC(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n*FactREC(n-1);
    }
}
