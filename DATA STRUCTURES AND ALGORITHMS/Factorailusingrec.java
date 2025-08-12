package RecursionLearning;
public class Factorailusingrec {
    public static void main(String[] args) {
        int ans=Fact(5);
        System.out.println(ans);
    }
    public static int Fact(int n)
    {
        if(n==1)
        {
            return n;
        }
        System.out.println(n);
        return n*Fact(n-1);
    }
}
