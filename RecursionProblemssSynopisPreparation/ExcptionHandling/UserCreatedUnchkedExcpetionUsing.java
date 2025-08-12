package RecursionProblemssSynopisPreparation.ExcptionHandling;

public class UserCreatedUnchkedExcpetionUsing
{
    public static void main(String[] args)
    {
        // for unchecked exception no need to use try catch in main method java will take care
            CheckInput(-2);
    }
    public static void CheckInput(int a) throws UserExceptionForUnchchekedException
    {
        if( a <0)
        {
            throw new UserExceptionForUnchchekedException("invalid input");
        }
        else
        {
            System.out.println("valid input");
        }
    }

}
