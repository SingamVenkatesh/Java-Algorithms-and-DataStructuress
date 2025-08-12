
import java.util.ArrayList;

public class SUbUsingRecc {
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int arr[] = {-2, 6, -7, 9, 4, -2, -5, 1, 9};
        int k = 3;
        for (int i = 0; i <= arr.length - k; i++) {
            boolean temp = true; // reset temp for each subarray
            funcSubArr(arr, i, i + k, temp, list);
            System.out.println();
        }
        System.out.println("Collected negative numbers:");
        System.out.println(list);
    }

    private static void funcSubArr(int[] arr, int i, int k, boolean temp, ArrayList<Integer> list) {
        if (i < k) {
            System.out.print(arr[i] + " ");
            if (arr[i] < 0 && temp) {
                temp = false;
                list.add(arr[i]);
            }
            funcSubArr(arr, i + 1, k, temp, list); // corrected recursive call
        }
    }
}

