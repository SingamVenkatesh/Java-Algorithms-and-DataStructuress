package RecursionLearning;

import java.util.Arrays;

public class RotatedArray {
    public static void main(String[] args) {
       // int arr[]={2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        System.out.println(2%5);
         int arr[] = {1,2,3,4,5};
        // arr[]=[2,4,6,8,10,12,14,16,18,20] steps=3 // output=[8,10,12,14,16,18,20,2,4,6];
        int steps=2;
        int ans[]=new int[arr.length];
        //System.out.println(Arrays.toString(ans));
        if(steps==arr.length)
        {
            System.out.println(Arrays.toString(arr));
        }
        else
        {
        int i=0;
        int n=arr.length;
        while (i<arr.length)
        {
            ans[i] = arr[(i + steps) % n];
            i++;
            //[8, 10, 12, 14, 16, 18, 20, 0, 0, 0]
        }
        }
        System.out.println(Arrays.toString(ans));
    }
}



/*
package RecursionLearning;

import java.util.Arrays;

public class RotatedArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int steps = 2;
        int n = arr.length;
        int ans[] = new int[n];

        // If steps == n, the rotated array remains the same
        if (steps == n) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        // Rotate array to the left by 'steps' positions
        for (int i = 0; i < n; i++) {
            ans[i] = arr[(i + steps) % n];
        }

        System.out.println(Arrays.toString(ans));
    }
}

 */
