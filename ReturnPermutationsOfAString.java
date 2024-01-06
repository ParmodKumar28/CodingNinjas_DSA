// Return Permutations of a String
// Hard
// Score
// 0/600
// Average time to solve is 60m
// Problem statement
// Given a string, find and return all the possible permutations of the input
// string.

// Note :
// The order of permutations are not important.
// Sample Input :
// abc
// Sample Output :
// abc
// acb
// bac
// bca
// cab
// cba

import java.util.ArrayList;

public class solution {

    public static String[] permutationOfString(String input) {
        // Write your code here
        ArrayList<String> output = new ArrayList<>();
        helper(input.toCharArray(), 0, output);

        String[] result = new String[output.size()];
        for (int i = 0; i < output.size(); i++) {
            result[i] = output.get(i);
        }
        return result;
    }

    public static void helper(char input[], int index, ArrayList<String> output) {
        if (index == input.length - 1) {
            output.add(new String(input));
        } else {
            for (int i = index; i < input.length; i++) {
                swap(input, index, i);
                helper(input, index + 1, output);
                swap(input, index, i);
            }
        }

    }

    public static void swap(char input[], int i, int j) {
        char temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }

}
