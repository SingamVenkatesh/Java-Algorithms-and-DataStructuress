package RecursionProblemssSynopisPreparation;

public class Numbers {
    public static void main(String[] args)
    {
        Printt();
    }
    static int count=0;
    public static void Printt()
    {
        if(count==4)
        {
            return;
        }
        System.out.println(count);
        count++;
        Printt();
    }
}
