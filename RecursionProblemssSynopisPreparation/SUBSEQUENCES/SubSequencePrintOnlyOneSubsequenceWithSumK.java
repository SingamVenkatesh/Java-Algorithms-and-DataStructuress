package RecursionProblemssSynopisPreparation.SUBSEQUENCES;

import java.util.ArrayList;

public class SubSequencePrintOnlyOneSubsequenceWithSumK
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
                int arr[]={2,4,6,10};
                int target=16;
                boolean flag=true;
              boolean ans=  SubseqSumK(flag,arr,target,0,0,new ArrayList<Integer>());
                System.out.println(ans);
            }

            private static boolean SubseqSumK(boolean flag,int[] arr,int target, int index, int sum,ArrayList<Integer> list)
            {
                int summ=16;
                if(index==arr.length )
                {
                    if(target==sum)
                    {
                        System.out.println(list);
                        return true;
                    }

                    return false;
                }
                list.add(arr[index]);
               if(SubseqSumK(flag,arr,target,index+1,sum+arr[index],list)==true) {
                   return true;
               }

                list.remove(list.size()-1);
                if(SubseqSumK(flag,arr,target,index+1,sum,list)==true)
                {
                    return true;

            }
                return false;
        }


    }

