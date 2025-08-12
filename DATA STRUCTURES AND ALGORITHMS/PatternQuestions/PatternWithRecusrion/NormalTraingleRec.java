package RecursionLearning.PatternQuestions.PatternWithRecusrion;

public class NormalTraingleRec {
    public static void main(String[] args) {

        int r=4,c=0;
        Triangle(r,c);
    }
    public static void Triangle(int r,int c)
    {
        if(r==0)
        {
            return;
        }
        if(c<r)
        {
            Triangle(r,c+1);
            System.out.print("* ");
        }
        else
        {
            Triangle(r-1,0);
            System.out.println();
        }





    }
}
