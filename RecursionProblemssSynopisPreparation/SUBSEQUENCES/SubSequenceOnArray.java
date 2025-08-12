package RecursionProblemssSynopisPreparation.SUBSEQUENCES;

import java.util.ArrayList;

public class SubSequenceOnArray {
    public static void main(String[] args)
    {
        int[] arr={1,2,3};
        SubSeqOnArr(arr,0,new ArrayList<Integer>());
    }
    private static void SubSeqOnArr(int[] arr,int index,ArrayList<Integer> list)
    {
        int n=arr.length;
        if(index>=n)
        {
            System.out.println(list);
            return;
        }
        list.add(arr[index]);
        SubSeqOnArr(arr,index+1,list);

        list.remove(list.size() - 1);
        SubSeqOnArr(arr,index+1,list);

    }
}
