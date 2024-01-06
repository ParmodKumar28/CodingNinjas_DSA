// Print Permutations of a String
// Hard
// Score
// 0/600
// Average time to solve is 60m
// Problem statement
// Given a string, find and print all the possible permutations of the input
// string.

// Note :
// The order of permutations are not important. Just print them in different
// lines.
// Sample Input :
// abc
// Sample Output :
// abc
// acb
// bac
// bca
// cab
// cba

public class solution {

    public static void permutations(String input) {
        // Write your code here
        helper(input.toCharArray(), 0);
    }

    // Helper
    public static void helper(char arr[], int index) {
        if (index == arr.length - 1) {
            System.out.println(new String(arr));
        } else {
            for (int i = index; i < arr.length; i++) {
                swap(arr, index, i);
                helper(arr, index + 1);
                swap(arr, index, i);
            }
        }

    }

    // Swapping the elements
    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
