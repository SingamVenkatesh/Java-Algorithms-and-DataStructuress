package RecursionLearning.SortingAlgorithms;

public class BUBBOLEEESORTTT {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 4, 2};
        bubbleSort(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // Optimization: if no swaps, array is sorted
            if (!swapped) break;
        }
    }
}

