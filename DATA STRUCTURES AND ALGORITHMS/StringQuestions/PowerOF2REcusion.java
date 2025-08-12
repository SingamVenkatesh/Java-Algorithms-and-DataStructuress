package RecursionLearning.StringQuestions;

public class PowerOF2REcusion {
    public static void main(String[] args) {

      //  PowerFun(16);
        System.out.println(PowerFun(16));
    }

 public static  boolean   PowerFun(int n)
    {

        if(n==1)
        {
            return true;
        }

        if(n%2!=0 || n<=0)
        {
            return false;
        }

        return PowerFun(n/2);


    }
}
