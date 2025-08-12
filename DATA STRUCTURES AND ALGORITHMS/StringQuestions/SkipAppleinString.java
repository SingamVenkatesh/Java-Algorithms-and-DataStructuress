package RecursionLearning.StringQuestions;

public class SkipAppleinString {

    public static void main(String[] args) {

       String ans= FUnct("abcdapplesin");
        System.out.println(ans);

    }

    public static String FUnct(String up)
    {

       if(up.isEmpty())
       {
           return "";
       }

       if(up.startsWith("apple"))
       {
          return FUnct(up.substring(5));
       }
      return up.charAt(0)+FUnct(up.substring(1));
    }


}
