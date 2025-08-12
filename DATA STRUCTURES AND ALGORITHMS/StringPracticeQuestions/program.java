package RecursionLearning.StringPracticeQuestions;

import RecursionLearning.StringBuffer;

import java.util.Arrays;

public class program {
    public static void main(String[] args) {
        String str="Venky";
        //StringBuffer buff=new StringBuffer(str);
        char[] arr=str.toCharArray();
        System.out.println(Arrays.toString(arr));

        String ans=new String(arr);
        System.out.println(ans);
    }
}
