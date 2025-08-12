package RecursionLearning.ArraysRecusion;

import java.util.ArrayList;

public class Returnarraylist {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,7,7};
        int target=7;
        ArrayList<Integer> list=new ArrayList<>();// we can also pass this list in the function
ArrayList<Integer> ans=Funct(arr,target,0,list);
        System.out.println(ans);
    }


   public static ArrayList<Integer> Funct(int[] arr,int target,int index,ArrayList<Integer> list)
    {
        if(index==arr.length)
        {
            return list;
        }
        if(arr[index]==target)
        {
            list.add(index);
        }


        return Funct(arr,target,index+1,list);



    }


}
