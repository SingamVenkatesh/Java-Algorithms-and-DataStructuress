package RecursionLearning.StringPracticeQuestions;

import java.util.Arrays;

public class RemoveSpecificword {
    public static void main(String[] args)
    {
        // we can do this program using split function and also using stringbuffer
        String str="Java is a powerful programming language";
        String word="powerful";
        String ans=str.replace(word," ");
        //System.out.println(ans);
        String[] arr=str.split(" ");
        System.out.println(Arrays.toString(arr));
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i].equals(word))
            {  // Fix: Use .equals() for string comparison
               continue;
            }
            else
            {
                sb.append(arr[i] + " ");
            }
        }

        System.out.println(sb);
    }
}
