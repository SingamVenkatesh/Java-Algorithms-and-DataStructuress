package RecursionProblemssSynopisPreparation.SUBSEQUENCES;
import java.util.ArrayList;
public class SubsequencesWithSumK
{
    /*
    Input:
arr = [2, 4, 6, 10]
k = 16

Output:
[2, 4, 10]
[6, 10]

    Input:
    arr = [1, 2, 1]
    k = 2
    Output:
        [1, 1]
        [2]

        Input:
arr = [1, 2, 3]
k = 3
Output:
[1, 2]
[3]
*/
    public static void main(String[] args)
    {
        int arr[]={1,2,1,1};
        int target=2;
        SubseqSumK(arr,target,0,0,new ArrayList<Integer>());
    }



    private static void SubseqSumK(int[] arr,int target, int index, int sum,ArrayList<Integer> list)
    {
        int summ=16;
        if(index==arr.length )
        {
            if(target==sum)
            {

                System.out.println(list);


            }


            return;
        }
        list.add(arr[index]);
        SubseqSumK(arr,target,index+1,sum+arr[index],list);

        list.remove(list.size()-1);
        SubseqSumK(arr,target,index+1,sum,list);

    }
}
