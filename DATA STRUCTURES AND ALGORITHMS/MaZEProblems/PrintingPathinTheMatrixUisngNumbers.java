package RecursionLearning.MaZEProblems;


import java.util.Arrays;

public class PrintingPathinTheMatrixUisngNumbers {

    public static void main(String[] args) {

        boolean[][] board={{true,true,true},
                {true,true,true},
                {true,true,true},
        };

        int path[][]=new int[board.length][board[0].length];
        AllPathsInAmatrixs("",board,0,0,path,1);

    }

    static  void AllPathsInAmatrixs(String p,boolean[][] maze,int r,int c,int path[][],int step )
    {
        // this will print the path to the target
        if(r==maze.length-1 && c==maze[0].length-1)
        {
            path[r][c]=step;
            for (int[] arr:path)
            {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;

        }
        if(maze[r][c]==false)
        {
            return;
        }

// im considering this block in my path.
// as im goind inside the function call i will mark the every cell i visited as false . so that i consdiered that cell in my path
        maze[r][c]=false;
        path[r][c]=step;



        if(r< maze.length-1) // this is for down
        {
            AllPathsInAmatrixs(p+'D',maze,r+1,c,path,step+1);
        }
        if(c<maze[0].length-1) // this is for rigth
        {
            AllPathsInAmatrixs(p+'R',maze,r,c+1,path,step+1);
        }
        if(r>0) // this is for up
        {
            AllPathsInAmatrixs(p+'U',maze,r-1,c,path,step+1);
        }
        if(c>0) // this is for up
        {
            AllPathsInAmatrixs(p+'L',maze,r,c-1,path,step+1);
        }


        // this line is where the function will be over i will mark it as true (Undo) action
       /* function call nunchi vellipothunam kabatti already ochetapudu visited cell ni false chesam
       kabddti malli epudu function ayipoyaka while goind upwards we will make that cells again true
       so that for other functins call it will be clear. If we not put as true then other function calls may
       not pass via that cell.....meaning "before the function gets removed also remove the changes made by that function call."
        */

        maze[r][c]=true; // this line says that backtracking and also line  30.
        path[r][c]=0;
    }

}
