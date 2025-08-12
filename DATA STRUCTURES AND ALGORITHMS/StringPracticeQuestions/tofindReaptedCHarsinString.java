package RecursionLearning.StringPracticeQuestions;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class tofindReaptedCHarsinString {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter char ");
       char ch = sc.next().charAt(0);
        String str="malayalam";
        int ans=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch)
            {
                ans=ans+1;
            }
        }
        System.out.println(ch + " is repeted " + ans+ " times");


    }
}
