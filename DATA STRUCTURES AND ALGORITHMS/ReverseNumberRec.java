package RecursionLearning;

public class ReverseNumberRec {

    public static void main(String[] args) {
        int n=1234;
        int ans=Reverse(n,0);
        System.out.println(ans);
    }

    public static int Reverse(int n,int rev)
    {
        if(n==0)
        {
            return rev;
        }
         rev=rev*10 + n%10;
        return Reverse(n/10,rev);


    }
}
