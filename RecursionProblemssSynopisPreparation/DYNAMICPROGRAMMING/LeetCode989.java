package RecursionProblemssSynopisPreparation.DYNAMICPROGRAMMING;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class LeetCode989 {
    public static void main(String[] args) {
        int nums[]={1,2,0,0};
        int k = 34;

        List<Integer> ans=functionnn(nums,k);
        System.out.println(ans);
    }

    private static List<Integer> functionnn(int[] nums, int k)
    {
        LinkedList<Integer> result = new LinkedList<>();
        int i = nums.length - 1;

        while (i >= 0 || k > 0)
        {
            if (i >= 0) {
                k =k+ nums[i];
            }
            result.addFirst(k % 10);
            k = k/10;
            i--;
        }

        return result;
    }
}
