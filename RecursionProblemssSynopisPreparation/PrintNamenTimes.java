package RecursionProblemssSynopisPreparation;

import java.util.Scanner;

public class PrintNamenTimes {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        String name=sc.nextLine();
        PrintName(name);
    }

    static int count=0;


    private static void PrintName(String name)
    {

        if(count==5)
        {
            return;
        }
        System.out.println(name);
        count++;
        PrintName(name +1);
    }






}
