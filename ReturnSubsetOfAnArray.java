// Return subset of an array
// Send Feedback
// Given an integer array (of length n), find and return all the subsets of
// input array.
// NOTE- Subsets are of length varying from 0 to n, that contain elements of the
// array. But the order of elements should remain same as in the input array.

// Note :
// The order of subsets are not important.

// Input format :

// Line 1 : Size of array

// Line 2 : Array elements (separated by space)

// Expected Time Complexity: O(2^N), where N is the size of given array
// Sample Input:
// 3
// 15 20 12
// Sample Output:
// [] (this just represents an empty array, don't worry about the square
// brackets)
// 12
// 20
// 20 12
// 15
// 15 12
// 15 20
// 15 20 12

import java.util.ArrayList;

public class solution {

    // Return a 2D array that contains all the subsets
    public static int[][] subsets(int input[]) {
        // Write your code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> current = new ArrayList<>();
        helper(input, 0, current, result);

        // Converting the result arraylist of arraylists to the 2d array ans.
        int ans[][] = new int[result.size()][];
        for (int i = 0; i < result.size(); i++) {
            ArrayList<Integer> subset = result.get(i);
            ans[i] = new int[subset.size()];
            for (int j = 0; j < subset.size(); j++) {
                ans[i][j] = subset.get(j);
            }
        }
        return ans;
    }

    public static void helper(int input[], int index, ArrayList<Integer> current,
            ArrayList<ArrayList<Integer>> result) {
        if (index == input.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Including the element and calling helper.
        current.add(input[index]);
        helper(input, index + 1, current, result);

        // Excluding the element and calling helper
        current.remove(current.size() - 1);
        helper(input, index + 1, current, result);
    }
}
