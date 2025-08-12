package RecursionLearning.MaZEProblems;

public class PathInAllDirections {

    public static void main(String[] args) {

boolean[][] board={{true,true,true},
                  {true,true,true},
                  {true,true,true},
};
        printPathALldirectioinsLRDU("",board,0,0);

    }

    static  void printPathALldirectioinsLRDU(String p,boolean[][] maze,int r,int c)
    {
        // this will print the path to the target
        if(r==maze.length-1 && c==maze[0].length-1)
        {
            System.out.println(p);
            return;
        }
        if(maze[r][c]==false)
        {
            return;
        }

// im considering this block in my path.
// as im goind inside the function call i will mark the every cell i visited as false . so that i consdiered that cell in my path
        maze[r][c]=false;



        if(r< maze.length-1) // this is for down
        {
            printPathALldirectioinsLRDU(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1) // this is for rigth
        {
            printPathALldirectioinsLRDU(p+'R',maze,r,c+1);
        }
        if(r>0) // this is for up
        {
            printPathALldirectioinsLRDU(p+'U',maze,r-1,c);
        }
        if(c>0) // this is for up
        {
            printPathALldirectioinsLRDU(p+'L',maze,r,c-1);
        }


       // this line is where the function will be over i will mark it as true (Undo) action
       /* function call nunchi vellipothunam kabatti already ochetapudu visited cell ni false chesam
       kabddti malli epudu function ayipoyaka while goind upwards we will make that cells again true
       so that for other functins call it will be clear. If we not put as true then other function calls may
       not pass via that cell.....meaning "before the function gets removed also remove the changes made by that function call."
        */

        maze[r][c]=true; // this line says that backtracking and also line  30.
    }

}
