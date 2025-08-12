package RecursionProblemssSynopisPreparation.FileHandling;

public class ProgramtoReadFromCommandLine
{
    public static void main(String[] args) {

/*here we passed values as a command line arguments that means values are stored
  in this String[] args array any type can send it will accept as a string go to edit congfiguration there
   pass  arugments */
        for(int i=0;i<args.length;i++)
        {
            System.out.println(args[i]);
        }
    }
}
