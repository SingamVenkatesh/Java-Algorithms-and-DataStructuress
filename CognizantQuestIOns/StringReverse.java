package CognizantQuestIOns;

public class StringReverse {
    public static void main(String[] args) {
        String str=new String("Venkatesh");
        String reverseString="";


        StringBuilder ans=new StringBuilder(str).reverse();
        System.out.println(ans);

        for(int i=str.length()-1;i>=0;i--)
        {
            reverseString=reverseString+str.charAt(i);

        }
        System.out.println(reverseString);
    }
}
