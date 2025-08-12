import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SUbArraywithK
{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;
        for (int i = 0; i <= arr.length - k; i++)
        {
            ArrayList list= new ArrayList<>();
            int arrr[]=new int[3];
            int c=0;

            for (int j = i; j < i + k; j++)
            {

               list.add(arr[j]);
               arrr[c++]=arr[j];
                System.out.print(arr[j] + " ");
                System.out.print(arr[j]);
            }
            System.out.println(list);
            System.out.println(Arrays.toString(arrr));
            System.out.println();
        }



    }
}

