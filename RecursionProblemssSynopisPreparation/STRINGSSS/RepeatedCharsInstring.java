package RecursionProblemssSynopisPreparation.STRINGSSS;

import java.util.Arrays;

public class RepeatedCharsInstring {

    public static void main(String[] args) {
        String str = "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbAAertyuiosdfghjldtuiiutrstrdtiuutyyutyyiytiyutiytiytttuyrtbbcc";
        int[] arr = new int[256]; // ASCII size

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++)
        {
            arr[str.charAt(i)]++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Repeated characters:");
        for (int i = 0; i < 256; i++) {
            if (arr[i] > 1) {
                System.out.println((char) i + " = " + arr[i]);
            }
        }
        Arrays.sort(arr);
        System.out.println( arr[arr.length-1]);
    }
}
