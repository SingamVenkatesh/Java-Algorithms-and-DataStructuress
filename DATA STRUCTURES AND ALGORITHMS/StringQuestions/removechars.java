package RecursionLearning.StringQuestions;

public class removechars {
    public static void main(String[] args) {


        String str="abababababccc";

        Funct(str,0,"");

    }

    public static void Funct(String str,int a,String ans)
    {
        if(a==str.length())
        {
            System.out.println(ans);
            return;
        }
        if(str.charAt(a)!='a')
        {
            ans=ans+str.charAt(a);

        }

        Funct(str,a+1,ans);


    }


}
