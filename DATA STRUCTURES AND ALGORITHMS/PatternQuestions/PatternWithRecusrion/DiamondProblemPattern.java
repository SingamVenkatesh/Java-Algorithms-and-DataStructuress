package RecursionLearning.PatternQuestions.PatternWithRecusrion;

import java.util.Scanner;


public class DiamondProblemPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of rows (half of the diamond)
        System.out.print("Enter the number of rows for half diamond: ");
        int n = scanner.nextInt();

        // Upper half of the diamond (including middle line)
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = i; j < n; j++)
            {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
