package RecursionLearning;

public class CountZeros {
    public static void main(String[] args) {
        int n=100;
        int ans=Countt(n,0);
        System.out.println(ans);
    }
    public static int Countt(int n,int count)
    {


        if(n==0)
        {
            return count;
        }
        int rem=n%10;
        if(rem==0)
        {
           count+=1;
        }
       return Countt(n/10,count);
    }
}
