package RecursionLearning.StringQuestions;

import java.util.ArrayList;

public class DICEPROBLEM {
    public static void main(String[] args) {


      ArrayList<String>  ans= diceproblemArrayListt("",4);
        System.out.println("this dice probelm using arraylist  : " + ans);


        Integer n=4;
        System.out.println("this is normal find combinations withoud AArraylist");
        diceproblem("",n);
    }

    public static void diceproblem(String p,int target)
    {
        if(target==0)
        {
            System.out.println(p);
            return;
        }
        for(int i=1;i<=6&&i<=target;i++)
        {
            diceproblem(p+i,target-i);
        }

    }




// dice problem using arraylist



    public static ArrayList<String> diceproblemArrayListt(String p,int target)
    {

        if(target==0)
        {
            ArrayList<String> list=new ArrayList<>();

            list.add(p);
            return list;
        }
       ArrayList<String > list=new ArrayList<>();
        for(int i=1;i<=6&&i<=target;i++)
        {
            list.addAll(diceproblemArrayListt(p+i,target-i));
        }
        return list;
    }

}
