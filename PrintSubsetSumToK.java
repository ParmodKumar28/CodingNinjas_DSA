// Print Subset Sum to K
// Hard
// Score
// 0/600
// Average time to solve is 60m
// Problem statement
// Given an array A and an integer K, print all subsets of A which sum to K.

// Subsets are of length varying from 0 to n, that contain elements of the
// array. But the order of elements should remain same as in the input array.

// Note :
// The order of subsets are not important. Just print them in different lines.

// Detailed explanation ( Input/output format, Notes, Images )
// Sample Input:
// 9
// 5 12 3 17 1 18 15 3 17
// 6
// Sample Output:
// 3 3
// 5 1

import java.util.ArrayList;

public class solution {
    public static void printSubsetsSumTok(int input[], int k) {
        // Write your code here
        ArrayList<Integer> arr = new ArrayList<>();
        helper(input, k, 0, arr, 0);

    }

    public static void helper(int input[], int k, int index, ArrayList<Integer> arr, int sum) {
        if (index == input.length) {
            if (sum == k) {
                for (int i = 0; i < arr.size(); i++) {
                    System.out.print(arr.get(i) + " ");
                }
                System.out.println();
            }
            return;
        }

        // Take
        sum += input[index];
        arr.add(input[index]);
        helper(input, k, index + 1, arr, sum);

        // Not take
        sum -= input[index];
        arr.remove(arr.size() - 1);
        helper(input, k, index + 1, arr, sum);
    }
}