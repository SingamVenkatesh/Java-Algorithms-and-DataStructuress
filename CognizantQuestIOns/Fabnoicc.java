package CognizantQuestIOns;

import java.util.Scanner;

public class Fabnoicc {
    public static void main(String[] args)
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(RecFabnoic(i));
        }
    }
    public static int RecFabnoic(int n)
    {
        if(n<2)
        {
            return n;
        }
        return RecFabnoic(n-1)+RecFabnoic(n-2);

    }
}

