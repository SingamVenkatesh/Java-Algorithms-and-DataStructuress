

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
public class IntersectionOF2Arrays {
    public static void main(String[] args)
    {
        int[] arr1 = {1, 2, 2, 3, 4, 5, 6}; // output : 2,3,5
        int[] arr2 = {2, 3, 5, 7, 8};
        HashSet<Integer> list=new HashSet<>();

        for(int i=0;i<arr1.length;i++)
        {
            boolean ans=false;
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    ans=true;
                }
            }
            if(ans)
            {
                list.add(arr1[i]);
            }
        }
        System.out.println(list);




    }
}
