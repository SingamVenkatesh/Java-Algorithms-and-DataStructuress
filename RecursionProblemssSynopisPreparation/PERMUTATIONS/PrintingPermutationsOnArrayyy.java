package RecursionProblemssSynopisPreparation.PERMUTATIONS;

import java.util.ArrayList;
import java.util.List;

   import java.util.Arrays;

    public class PrintingPermutationsOnArrayyy
{
        public static void main(String[] args) {
            int[] arr = {1, 2, 3};
            permute(arr, 0);
        }

        public static void permute(int[] arr, int index) {
            if (index == arr.length) {
                System.out.println(Arrays.toString(arr));

                return;
            }

            for (int i = index; i < arr.length; i++) {
                swap(arr, index, i); // choose
                permute(arr, index + 1); // explore
                swap(arr, index, i); // unchoose (backtrack)
            }
        }

        private static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
