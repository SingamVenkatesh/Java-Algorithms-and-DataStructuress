package RecursionProblemssSynopisPreparation;

import java.util.ArrayList;

public class ReverseArrayandStoreinArrayList {
    public static void main(String[] args) {

        int[] arr={10,9,8,7,6,5,4,3,2,1};
        int length=arr.length-1;
        ArrayList<Integer> ans = Reverseee(arr, length,new ArrayList<>());
        System.out.println(ans);
    }



    private static ArrayList Reverseee(int[] arr,int length,ArrayList<Integer> list)
    {
        //list=new ArrayList<>();
        if(length<0)
        {

            return list;
        }
        list.add(arr[length]);
        return Reverseee(arr,length-1,list);



    }
}
