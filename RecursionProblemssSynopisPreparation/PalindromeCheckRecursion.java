package RecursionProblemssSynopisPreparation;

public class PalindromeCheckRecursion {
    public static void main(String[] args) {
        String str="racecar";
        boolean check=ifPalindrome(str,0,str.length()-1);
        System.out.println(check);

        boolean checkk=ifPalindromeee(str,0);
        System.out.println(checkk);


    }
    private static boolean ifPalindrome(String str,int s,int e)
    {
        if(s>=e)
        {
            return true;
        }
        if(str.charAt(s) !=str.charAt(e))
        {
            return false;
        }

       return ifPalindrome(str,s+1,e-1);

    }


    private static boolean ifPalindromeee(String str,int index)
    {
           int n=str.length();
        if (index >= n / 2) {
            return true;
        }
        if(str.charAt(index)!=str.charAt(str.length()-index-1))
        {
            return false;
        }
        return ifPalindromeee(str,index+1);


    }






}
