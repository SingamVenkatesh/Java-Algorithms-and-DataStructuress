package RecursionLearning.StringQuestions;
public class SUbSetRecursion {
    public static void main(String[] args) {
        String str="ab";
        SUbsett("",str);
    }
    public static void SUbsett(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        SUbsett(p+ch,up.substring(1));
        SUbsett(p,up.substring(1));
    }
}
