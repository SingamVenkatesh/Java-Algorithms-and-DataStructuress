package RecursionLearning.StringPracticeQuestions;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveAllDuplicateCharactersfromaString {
    public static void main(String[] args)
    {

        String[] a={"venkatesh","envakshet"};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));


        /*
        Input	Output
        "banana"	"ban"
        "hello world"	"helo wrd"
        "aabbcc"	"abc"
        */
        String str = "hello world";
        String ans = " ";

        for (int i = 0; i < str.length(); i++) {
            if (find(ans, str.charAt(i))) {
                continue;
            } else {
                ans = ans + str.charAt(i);
            }
        }
        System.out.println(ans);
    }

    public static boolean find(String sb,char ch)
    {
        if(sb.contains(String.valueOf(ch)))
        {
            return true;
        }
        return false;

    }

}
