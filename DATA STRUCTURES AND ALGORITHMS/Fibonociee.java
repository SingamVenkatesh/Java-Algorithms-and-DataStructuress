package RecursionLearning;

public class Fibonociee {

    public static void main(String[] args) {

        int ans=Fiboo(10);
        System.out.println(ans);
    }

    public  static int Fiboo(int n)
    {
        if(n<2)
        {
            return n;
        }
        return Fiboo(n-1)+Fiboo(n-2);

    }


}
