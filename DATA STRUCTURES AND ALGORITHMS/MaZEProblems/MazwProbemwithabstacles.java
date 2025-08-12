package RecursionLearning.MaZEProblems;



public class MazwProbemwithabstacles {

    public static void main(String[] args) {


        /* // this obeys only right side and down side
        you need to find all the paths to the target wihtout visting the false cell
        [true] [true] [true]
        [true] [false] [true]
        [true] [true] [true]
         */



        boolean[][] board={{true,true,true},
                             {true,false,true},
                           {true,true,true}
                              };

        printPathOfMazeeWIthAbstacles("",board,0,0);
    }
    static  void printPathOfMazeeWIthAbstacles(String p,boolean[][] maze,int r,int c)
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
        if(r< maze.length-1)
        {
            printPathOfMazeeWIthAbstacles(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1)
        {
            printPathOfMazeeWIthAbstacles(p+'R',maze,r,c+1);
        }
    }

}

