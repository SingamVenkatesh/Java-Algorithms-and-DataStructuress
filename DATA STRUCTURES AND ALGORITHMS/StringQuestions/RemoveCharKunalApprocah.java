package RecursionLearning.StringQuestions;
public class RemoveCharKunalApprocah {
    public static void main(String[] args) {
       // skip("","abcdabcd");
     String ans= ReturnString("abcd");
        System.out.println(ans);
    }
/*
    public static void skip(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println("String after removing a's " + p);
            return;
        }
        char ch=up.charAt(0);
        if(ch=='a')
        {
            // just skip this value
            skip(p,up.substring(1));
        }
        else {
            skip(p+ch,up.substring(1));
        }
    }

    */
// below program is using only one parameter as a string
    public static String ReturnString(String up)
    {
        if(up.isEmpty())
        {
           // System.out.println("String after removing a's " + p);
            return "";
        }
        char ch=up.charAt(0);
        if(ch=='a')
        {
            // just skip this value
           return ReturnString(up.substring(1));
        }
        else {
           return ch+ReturnString(up.substring(1));
        }
    }


}
