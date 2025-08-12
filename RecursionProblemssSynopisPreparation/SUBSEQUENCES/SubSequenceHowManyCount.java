package RecursionProblemssSynopisPreparation.SUBSEQUENCES;

public class SubSequenceHowManyCount {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int target = 2;
        // number of counts are 2. THr
        int count = countSubsequences(arr, target, 0, 0);
        System.out.println("Total subsequences with sum " + target + ": " + count);
    }

    private static int countSubsequences(int[] arr, int target, int index, int sum) {
        if (index == arr.length)
        {
            if(sum==target)
            {
                return 1;
            }
            return 0;
           //
            // return (sum == target) ? 1 : 0;
        }
        // Include current element
        int left = countSubsequences(arr, target, index + 1, sum + arr[index]);

        // Exclude current element
        int right = countSubsequences(arr, target, index + 1, sum);

        return left + right;
    }
}
