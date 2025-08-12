package RecursionLearning.StringPracticeQuestions;

import java.util.Arrays;

public class MostRepatedeCharinString {
    public static void main(String[] args)
    {
        int anss[]={1,0,1,0,1,0,1,0,1,0,0,1,0};
        Arrays.sort(anss);
        System.out.println(Arrays.toString(anss));
        String str="aaaaaaaaaabbbbbb";
        int count=0;
        int ans=0;
        char ch=' ';
        for(int i=0;i<str.length();i++)
        {
            for(int j=0;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    count=count+1;
                }
            }
            if(count>ans)
            {
                ans=count;
                ch=str.charAt(i);
            }
            count=0;


        }
        System.out.println(count );
        System.out.println(ans + " times repeated "+ ch);
    }
}
