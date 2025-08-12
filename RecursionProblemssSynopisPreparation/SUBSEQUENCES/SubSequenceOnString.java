package RecursionProblemssSynopisPreparation.SUBSEQUENCES;

public class SubSequenceOnString
{
    public static void main(String[] args)
    {

        String str="abc";
        subsequencesss(" ",str);
    }
    private static void subsequencesss( String p,String up)
    {

        if(up.isEmpty())
        {
            System.out.println(p);
            return;

        }
        char ch=up.charAt(0);
        subsequencesss(p+ch,up.substring(1));
        subsequencesss(p,up.substring(1));


    }
}
