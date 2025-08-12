package RecursionLearning.PatternQuestions.PatternWithRecusrion;

import java.util.Scanner;

public class MONTHS {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter month");
        String month=sc.nextLine();
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        int[] days = {31, 28,31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for(int i=0;i<months.length;i++)
        {
            if(months[i].equals(month))
            {
                System.out.println("Number of days is " + days[i]);
            }
        }


    }
}
