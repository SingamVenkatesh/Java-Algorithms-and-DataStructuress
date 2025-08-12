package RecursionLearning;

public class concept {
    public static void main(String[] args) {
        concepttt(5);
      //  System.out.println(ans);

    }

    public static void concepttt(int n)
    {


        if(n==0)
        {
            return;
        }

        System.out.println(n);
        //  concepttt(n--);// if we execute this give stack overflow beacause n-- will print and update
        concepttt(--n);
    }
}
