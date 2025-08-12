package RecursionLearning.ArraysRecusion;

public class PrimeNUmberProgram {
    public static void main(String[] args) {
        int num=6;

        int count=0;
        for(int i=2;i<5;i++)
        {


            if(num%i==0)
            {
                count=count+1;
            }
        }
        if(count>=1)
        {
            System.out.println("NUmber is not prime");
        }
        else
        {
            System.out.println(" prime");
        }
    }
}
