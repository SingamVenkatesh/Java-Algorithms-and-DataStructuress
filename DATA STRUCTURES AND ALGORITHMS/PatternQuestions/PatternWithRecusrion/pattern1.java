package RecursionLearning.PatternQuestions.PatternWithRecusrion;

public class pattern1 {
    public static void main(String[] args) {


      int row=4;
      int col=0;
        Trianglle(row,col);
    }

    public static void Trianglle(int row, int col)
    {

        if(row==0)
        {
            return;
        }
        if(col<row)
        {
            System.out.print("*");
            Trianglle(row,col+1);
        }
        else
        {
            System.out.println();
            Trianglle(row-1,0);
        }




    }
}
