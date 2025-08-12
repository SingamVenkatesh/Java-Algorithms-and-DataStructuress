package RecursionLearning.DynamicProgramming;

public class KanpSackWithRec {
    public static void main(String[] args) {
        int[] val = {60, 100, 120};
        int[] wet = {10, 20,30};
        int w = 50;
        int n = val.length;
        System.out.println("Maximum value in Knapsack: " + KnapSack(wet, val, w, n));
    }
    public static int KnapSack(int[] wet, int[] val, int w, int n) {
        // Base
        // case: If no items left or capacity is 0
        if (n == 0 || w == 0) {
            return 0;
        }
        // If the current item's weight is less than or equal to the capacity
        if (wet[n - 1] <= w)
        {
            return Math.max(
                    val[n - 1] + KnapSack(wet, val, w - wet[n - 1], n - 1), // Include item
                    KnapSack(wet, val, w, n - 1) // Exclude item
            );
        }
        else {
            return KnapSack(wet, val, w, n - 1); // Skip item
        }
    }
}
/*
knapsack(50, 3) = max(120 + knapsack(20, 2), knapsack(50, 2))
knapsack(20, 2) = max(100 + knapsack(0, 1), knapsack(20, 1)) = 100
knapsack(50, 2) = max(100 + knapsack(30, 1), knapsack(50, 1))
knapsack(30, 1) = max(60 + knapsack(20, 0), knapsack(30, 0)) = 60
knapsack(50, 1) = max(60 + knapsack(40, 0), knapsack(50, 0)) = 60




Recursive Calls Breakdown
We start with the call:

lua
Copy
Edit
knapsack(50, 3) = max(120 + knapsack(20, 2), knapsack(50, 2))
Left Side Recursion:
lua
Copy
Edit
knapsack(20, 2) = max(100 + knapsack(0, 1), knapsack(20, 1))
knapsack(0, 1) = 0 (Base case)
knapsack(20, 1) = 60 (Since the first item fits)
lua
Copy
Edit
knapsack(20, 2) = max(100 + 0, 60) = 100
Now, back to the previous step:

lua
Copy
Edit
knapsack(50, 3) = max(120 + 100, knapsack(50, 2))
lua
Copy
Edit
knapsack(50, 3) = max(220, knapsack(50, 2))
Right Side Recursion:
lua
Copy
Edit
knapsack(50, 2) = max(100 + knapsack(30, 1), knapsack(50, 1))
knapsack(30, 1) = max(60 + knapsack(20, 0), knapsack(30, 0)) = 60
knapsack(50, 1) = max(60 + knapsack(40, 0), knapsack(50, 0)) = 60
lua
Copy
Edit
knapsack(50, 2) = max(100 + 60, 60) = max(160, 60) = 160
Final Calculation
lua
Copy
Edit
knapsack(50, 3) = max(220, 160) = 220
✔ The left side recursion results in 220
✔ The right side recursion results in 160

So the correct maximum knapsack value is 220 ✅




 */
