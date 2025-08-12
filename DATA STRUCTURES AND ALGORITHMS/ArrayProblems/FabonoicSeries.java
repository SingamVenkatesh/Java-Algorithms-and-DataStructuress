import java.util.*;
public class FabonoicSeries {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int start=0;
        int end=1;
        System.out.println("ENter the nmber");
        int n=sc.nextInt();

        if(n>=1)
        {
            System.out.println(start);
        }
        if(n>=2)
        {
            System.out.println(end);
        }
        while(n>0)
        {
            int ans=start+end;
            System.out.println(ans);
            start=end;
            end=ans;
            ans=0;
            n=n-1;
        }
    }
}
