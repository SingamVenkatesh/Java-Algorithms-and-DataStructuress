package RecursionProblemssSynopisPreparation.SUBSETS;
import java.util.ArrayList;
import java.util.List;
public class SubSetSumsInArray
{
    /*
    arr = [3, 1, 2]
 subset   	         Sum
[]	                 0
[3]               	 3
[1]            	     1
[2]                  2
[3, 1]                4
[3, 2]                 5
[1, 2]	               3
[3, 1, 2]              6
////output [0, 3, 1, 4, 2, 5, 3, 6]
     */
    public static void main(String[] args)
    {
        int[] arr={3,1,2};
        List<Integer> ans=new ArrayList<>();
      SubSetSumInArrayyy(arr,0,new ArrayList<Integer>(),ans);
       System.out.println(ans);


        // 2nd method to solve



        int[] arr1={3,1,2};

        SubSetSumInArrayyy1(arr,0,new ArrayList<Integer>(),0);

    }

    private static void SubSetSumInArrayyy(int[] arr, int n,ArrayList<Integer> list,List<Integer> listans)
    {
        if(n==arr.length)
        {
           System.out.println(list);
            int sum=0;
            for(Integer a:list)
            {
                sum+=a;
            }
            System.out.print(sum+ " ");
            listans.add(sum);
            return;
        }
        list.add(arr[n]);
        SubSetSumInArrayyy(arr,n+1,list,listans);
        list.remove(list.size()-1);
        SubSetSumInArrayyy(arr,n+1,list,listans);
    }



    private static void SubSetSumInArrayyy1(int[] arr, int n,ArrayList<Integer> list,int sum)
    {
        if(n==arr.length)
        {
            System.out.print(sum+ " ");
            return;
        }
        list.add(arr[n]);
        SubSetSumInArrayyy1(arr,n+1,list,sum+arr[n]);
        list.remove(list.size()-1);
        SubSetSumInArrayyy1(arr,n+1,list,sum);
    }
}
