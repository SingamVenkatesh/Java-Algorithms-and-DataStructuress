package RecursionProblemssSynopisPreparation.SUBSEQUENCES;
import java.util.*;
public class COmbiantionSUmLeetcode40
{
    public static void main(String[] args)
    {
        /*
        Input: candidates = [10,1,2,7,6,1,5], target = 8
Output:
[
[1,1,6],
[1,2,5],
[1,7],
[2,6]
]
         */
        int[] arr={10,1,2,7,6,1,5};
        int target=8;
      List<List<Integer>> answer=combinationSum2(arr,target);
        System.out.println(answer);
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target)
    {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }
    private static void backtrack(int[] arr, int target, int index, List<Integer> current, List<List<Integer>> ans)
    {
        if (target == 0)
        {
            ans.add(new ArrayList<>(current));
            return;
        }
        for (int i = index; i < arr.length; i++)
        {

            if (i > index && arr[i] == arr[i - 1])
            {
                continue;
            }
            if (arr[i] > target)
            {
                break;
            }
            current.add(arr[i]);
            backtrack(arr, target - arr[i], i + 1, current, ans);
            current.remove(current.size() - 1);
        }
    }
}
