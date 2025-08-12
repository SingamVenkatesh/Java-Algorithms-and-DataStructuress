package RecursionProblemssSynopisPreparation.SUBSETS;

import java.util.ArrayList;

public class SubSetsPrintingInArray
{     // subsets in array
    public static void main(String[] args)
    {
        int[] arr={3,2,1};

        /*
        int[] arr={3,2,1};
        [3, 2, 1]
[3, 2]
[3, 1]
[3]
[2, 1]
[2]
[1]
[]

         */

        subsett(arr,0,new ArrayList<Integer>());
    }
    private static void subsett(int[] arr,int n,ArrayList<Integer> list)
    {
        if(n==arr.length)
        {
            System.out.println(list);
            return;
        }
        list.add(arr[n]);
        subsett(arr,n+1,list);
        list.remove(list.size()-1);
        subsett(arr,n+1,list);

    }

}



