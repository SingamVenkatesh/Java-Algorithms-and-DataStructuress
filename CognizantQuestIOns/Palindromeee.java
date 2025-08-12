package CognizantQuestIOns;

public class Palindromeee {
    public static void main(String[] args)
    {

        String str="madam";
        System.out.println(ISpalindrome(str));

    }
    public static boolean ISpalindrome(String str)
    {
        int i=0;
        int j=str.length()-1;
        while(i!=j)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                return false;

            }
            i++;
            j--;
        }
        return true;
    }
}
