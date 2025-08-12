package RecursionLearning.STACKSandQUEESS.StackandQueusQUestions;

import java.util.Arrays;
import java.util.Scanner;

public class TwoStacksProblem {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);



        //int t=sc.nextInt();
      //  for (int i=0;i<t;i++)
      //  {
            System.out.println("enter first array length");
            int n= sc.nextInt();
            System.out.println("Enter second array length");
            int m=sc.nextInt();
            System.out.println("Enter  maxsUm ");
            int actualSUm=sc.nextInt();

            int[] a=new int[n];
            int[] b=new int[m];

            for (int j=0;j<a.length;j++)
            {
                System.out.println("Enete first array elemtns");
                a[j]=sc.nextInt();
            }

            for (int k=0;k<b.length;k++)
            {
                System.out.println("Enete second array elemtns");
                b[k]=sc.nextInt();
            }

            System.out.println("Number of counts " + twoStacks(actualSUm,a,b));
       // }

        //System.out.println(twoStacks());



    }

    static int twoStacks(int actualSum,int[] a,int[] b)
    {
        return twoStackss(actualSum,a,b,0,0)-1;
    }

    private static int twoStackss(int actualSum, int[] a, int[] b, int sum,int count)
    {

        if (sum > actualSum)
        {
            return count;
        }

        if(a.length==0||b.length==0)
        {
            return count;
        }
        int ans1 = twoStackss(actualSum,Arrays.copyOfRange(a,1,a.length),b,sum+a[0],count+1);
        int ans2=twoStackss(actualSum,a,Arrays.copyOfRange(b,1,b.length),sum+b[0],count+1);

        return Math.max(ans1,ans2);


    }
}

