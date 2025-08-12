package RecursionProblemssSynopisPreparation.Stringss;

import java.util.Arrays;

public class Stringmethodss
{
    public static void main(String[] args) {
        String s="asingam   venkatesha";
        System.out.println(s.indexOf('a'));
        System.out.println(s.lastIndexOf('a'));
        System.out.println(s.contains("ha"));
        char ch[]=s.toCharArray();
        System.out.println(Arrays.toString(ch));

    }
}
