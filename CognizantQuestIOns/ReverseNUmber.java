package CognizantQuestIOns;
import java.util.Scanner;
public class ReverseNUmber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter any number");
        int a=sc.nextInt();
        int rem=0;
        while(a>0)
        {
            int v=a%10;
            rem=rem*10+v;
            a=a/10;
        }
        System.out.println(rem);
    }
}
