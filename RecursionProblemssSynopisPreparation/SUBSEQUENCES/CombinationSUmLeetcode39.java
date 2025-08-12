package RecursionProblemssSynopisPreparation.SUBSEQUENCES;

import CODINGQUESTIONS.Inheritance;

import java.util.ArrayList;
import java.util.List;

public class CombinationSUmLeetcode39
{
    public static void main(String[] args)
    {
        /*
        Input: candidates = [2,3,6,7], target = 7
          Output: [[2,2,3],[7]]

          [2,3,5] target =8
         */
        int[] candidates={2,3,5};
        int target=8;
        List<List<Integer>> ans=combinationSum(candidates,target);
        for(List<Integer> a: ans)
        {
            System.out.println(a);
        }
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target)
    {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        Combination(candidates, target, 0, 0, current, ans);
        return ans;
    }
    public static void Combination(int[] arr,int target,int index,int sum,List<Integer> list,List<List<Integer>> ans)
    {
        if(sum==target)
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        if(sum>target || index==arr.length)
        {
            return;
        }
        if(arr[index]<=target)
        {
            list.add(arr[index]);
            Combination(arr, target, index, sum + arr[index], list, ans);
            list.remove(list.size() - 1);
        }
        Combination(arr,target,index+1,sum,list,ans);
    }


    }

