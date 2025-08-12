package RecursionLearning.StringQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class PHonepadLeetdcodeno17 {
    public static void main(String[] args) {

       String str="12";
        LeetCodeProblem17("",str);


     //  ArrayList<String> ans= PhonePadUsingArrayList("","12");
       // System.out.println(ans);

    }
    public static void LeetCodeProblem17(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        int digit=up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++)
        {
            char ch=(char) ('a'+i);
            LeetCodeProblem17(ch+p,up.substring(1));
        }
    }


    public static ArrayList<String > PhonePadUsingArrayList(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list=new ArrayList<>();
           list.add(p);
           return list;
        }

        int digit=up.charAt(0)-'0';

        ArrayList<String> list=new ArrayList<>();
        for(int i=(digit-1)*3;i<digit*3;i++)
        {
            char ch=(char) ('a'+i);
          list.addAll(PhonePadUsingArrayList(p+ch,up.substring(1)));
        }
        return list;
    }
}
