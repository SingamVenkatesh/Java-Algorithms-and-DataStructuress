package RecursionProblemssSynopisPreparation.ExcptionHandling;

public class UsingUserCreatedCheckedExceptioni
{
    public static void main(String[] args)
    {

        try {
            ValidateAge(13);
        }
        catch (UserExceptionnForCHeckedException e)
        {
            System.out.println(e.getMessage());
        }

    }


    public static void ValidateAge(int age) throws UserExceptionnForCHeckedException
    {
        if(age<18)
        {
            throw new UserExceptionnForCHeckedException("age muste be above 18");
        }
        else
        {
            System.out.println("valid age");
        }
    }
}
