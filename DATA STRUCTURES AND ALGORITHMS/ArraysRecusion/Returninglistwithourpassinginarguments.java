package RecursionLearning.ArraysRecusion;

import java.util.ArrayList;

public class Returninglistwithourpassinginarguments {
    public static void main(String[] args) {
        int arr[]={1,2,2,2};
        int target=2;
        ArrayList<Integer> list=Funct(arr,target,0);
        System.out.println(list);

    }

   public static ArrayList<Integer> Funct(int arr[],int target,int index)
   {
       ArrayList<Integer> list=new ArrayList<>();
       if(index==arr.length)
       {
           return list;
       }
       if(arr[index]==target)
       {
           list.add(index);
       }
       ArrayList<Integer> frombelowcallas=Funct(arr,target,index+1);
       list.addAll(frombelowcallas);
       return list;
   }

}
