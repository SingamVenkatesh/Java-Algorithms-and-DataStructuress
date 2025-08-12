package RecursionLearning.StringPracticeQuestions;

import java.util.Arrays;

public class question {
    public static void main(String[] args) {
        String str=new String("SIn,gam, venkatesh patel ");

        String[] arr=str.split(",");
        System.out.println(Arrays.toString(arr));

    }
}
