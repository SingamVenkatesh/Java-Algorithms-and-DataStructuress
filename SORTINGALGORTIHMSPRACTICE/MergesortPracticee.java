package SORTINGALGORTIHMSPRACTICE;

import java.util.Arrays;

public class MergesortPracticee {
    public static void main(String[] args) {
        //int[] arr={5,4,3,2,1};
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] ans = mergerrr(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] mergerrr(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergerrr(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergerrr(Arrays.copyOfRange(arr, mid, arr.length));
        return mix(left, right);

    }

    private static int[] mix(int[] first, int[] second) {
        int mix[] = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }
        //  System.out.println(Arrays.toString(mix));
        return mix;
    }

}





