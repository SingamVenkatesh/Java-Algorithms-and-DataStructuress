package RecursionLearning.SortingAlgorithms;
import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(MaxIndex(arr, 0, arr.length - 1));  // optional test
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i -1;
            int maxIndex = MaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }
    public static int MaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
