package RecursionLearning.MaZEProblems;

import java.util.ArrayList;

public class mazeeproblem {
    public static void main(String[] args)
    {
// this problem is to count the number of ways there to reach the target like in a matrix .
   //     [0] [] [] // now we need to reach target total how many ways are there to reach.
     //   [] [] []  // rule is you need to move either towards right and towards down .
      //  [] [] [target]

      System.out.println("we can move in these many ways to target  :" + count(51,9)); // this is to print or count the number of ways

       //printPathOfMazee("",3,3); // this is to print the path

      //  System.out.println(printPathInArrayListt("",3,3)); // this is to print the path in the arraylist

     //   System.out.println("This arrylist including diagnoal path : " + printPathInArrayListtinicudingDiagnoals("",3,3)); // this is to print the path in arraylist including diagnoals





    }
    static int count(int r,int c)
    {

        // this will print the number of ways we can reach to the target i mean integer value
        if(r==1||c==1)
        {
            return 1;
        }
        int left=count(r-1,c);
        int right=count(r,c-1);
         return left+right;
    }


    static  void printPathOfMazee(String p,int r,int c)
    {
        // this will print the path to the target
        if(r==1&& c==1)
        {
            System.out.println(p);
            return;
        }
        if(r>1)
        {
            printPathOfMazee(p+'D',r-1,c);
        }
        if(c>1)
        {
            printPathOfMazee(p+'R',r,c-1);
        }
    }




   static ArrayList<String> printPathInArrayListt(String  p, int r,int c)
   {

       if(r==1 && c==1)
       {
           ArrayList<String> list=new ArrayList<>();
           list.add(p);
           return list;
       }
       ArrayList<String> list=new ArrayList<>();
       if(r>1)
       {
           list.addAll(printPathInArrayListt(p+"D",r-1,c));
       }

       if(c>1)
       {
           list.addAll((printPathInArrayListt(p+"R",r,c-1)));
       }

       return  list;
   }













// in this porgram diagnal way is aslo considered where as in above problems no diagnoals were considered only right and down apparach
    static ArrayList<String> printPathInArrayListtinicudingDiagnoals(String  p, int r,int c)
    {

        if(r==1 && c==1)
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();

        if(r>1&&c>1)
        {
            list.addAll(printPathInArrayListtinicudingDiagnoals(p+'D',r-1,c-1));
        }
        if(r>1)
        {
            list.addAll(printPathInArrayListtinicudingDiagnoals(p+'V',r-1,c));
        }

        if(c>1)
        {
            list.addAll((printPathInArrayListtinicudingDiagnoals(p+'H',r,c-1)));
        }

        return  list;
    }




















}
