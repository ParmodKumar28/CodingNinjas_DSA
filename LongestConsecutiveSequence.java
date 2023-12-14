// Longest Consecutive Sequence
// Send Feedback
// You are given an array of unique integers that contain numbers in random
// order. You have to find the longest possible sequence of consecutive numbers
// using the numbers from given array.
// You need to return the output array which contains starting and ending
// element. If the length of the longest possible sequence is one, then the
// output array must contain only single element.
// Note:
// 1. Best solution takes O(n) time.
// 2. If two sequences are of equal length, then return the sequence starting
// with the number whose occurrence is earlier in the array.
// Input format:
// The first line of input contains an integer, that denotes the value of the
// size of the array. Let us denote it with the symbol n.
// The following line contains n space separated integers, that denote the value
// of the elements of the array.
// Output format:
// The first and only line of output contains starting and ending element of the
// longest consecutive sequence. If the length of the longest consecutive
// sequence is 1, then just print the starting element.
// Constraints :
// 0 <= n <= 10^6
// Time Limit: 1 sec
// Sample Input 1 :
// 13
// 2 12 9 16 10 5 3 20 25 11 1 8 6
// Sample Output 1 :
// 8 12
// Explanation:The longest consecutive sequence here is [8, 9, 10, 11, 12]. So
// the output is the start and end of this sequence: [8, 12].
// Sample Input 2 :
// 7
// 3 7 2 1 9 8 41
// Sample Output 2 :
// 7 9
// Explanation:There are two sequences of equal length here: [1,2,3] and
// [7,8,9]. But since [7,8,9] appears first in the array (7 comes before 1), we
// return this sequence. So the output is [7,9].
// Sample Input 3 :
// 7
// 15 24 23 12 19 11 16
// Sample Output 3 :
// 15 16
// Explanation:The longest consecutive sequence here is [15,16]. So the output
// is [15,16].

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class Solution {
    public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
        /*
         * Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int key : arr) {
            map.put(key, true);
        }

        for (int key : arr) {
            if (map.containsKey(key - 1)) {
                map.put(key, false);
            }
        }

        int count = 0, maxLength = 0, start = 0, initialStart = 0;
        for (int key : arr) {
            count = 1;
            initialStart = key;

            while (map.containsKey(key + count)) {
                count++;
            }

            if (count > maxLength) {
                maxLength = count;
                start = initialStart;
            }
        }

        ans.add(start);
        ans.add(start + maxLength - 1);
        return ans;
    }
}