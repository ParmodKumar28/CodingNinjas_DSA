// Return subsets sum to K
// Send Feedback
// Given an array A of size n and an integer K, return all subsets of A which
// sum to K.
// Subsets are of length varying from 0 to n, that contain elements of the
// array. But the order of elements should remain same as in the input array.

// Note :
// The order of subsets are not important.

// Input format :
// Line 1 : Integer n, Size of input array
// Line 2 : Array elements separated by space
// Line 3 : K
// Constraints :
// 1 <= n <= 20
// Sample Input :
// 9
// 5 12 3 17 1 18 15 3 17
// 6
// Sample Output :
// 3 3
// 5 1

import java.util.ArrayList;

public class solution {

    // Return a 2D array that contains all the subsets which sum to k
    public static int[][] subsetsSumK(int input[], int k) {
        // Write your code here
        ArrayList<Integer> current = new ArrayList<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        helper(input, k, 0, 0, current, result);

        // Convert ArrayList of ArrayLists to 2D array
        int output[][] = new int[result.size()][];
        for (int i = 0; i < result.size(); i++) {
            ArrayList<Integer> subset = result.get(i);
            output[i] = new int[subset.size()];
            for (int j = 0; j < subset.size(); j++) {
                output[i][j] = subset.get(j);
            }
        }
        return output;
    }

    public static void helper(int input[], int k, int index, int sum, ArrayList<Integer> current,
            ArrayList<ArrayList<Integer>> result) {
        if (index == input.length) {
            if (sum == k) {
                result.add(new ArrayList<>(current));
            }
            return;
        }
        // Taking the element
        current.add(input[index]);
        sum += input[index];
        helper(input, k, index + 1, sum, current, result);

        // Not taking the element
        sum -= input[index];
        current.remove(current.size() - 1);
        helper(input, k, index + 1, sum, current, result);
    }
}
