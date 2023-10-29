// Check Palindrome (recursive)
// Send Feedback
// Check whether a given String 'S' is a palindrome using recursion.

// Return true or false.

// Note:
// You don’t need to print anything. Just implement the given function.
// Example:
// Input: s = "racecar"
// Output: true
// Explanation: "racecar" is a palindrome.
// Input Format:
// The first and only line of the input contains string S.
// Output format:
// Return a boolean value True or False.
// Sample Input 1:
// abbba
// Sample Output 1:
// true
// Explanation Of Sample Input 1 :
// “abbba” is a palindrome
// Sample Input 2:
// abcd
// Sample Output 2:
// false
// Explanation Of Sample Input 2 :
// “abcd” is not a palindrome.
// Constraints:
// 0 <= |S| <= 10^6
// where |S| represents the length of string S.

import java.util.Scanner;

/**
 * CheckPalindromeRecursive
 */
public class CheckPalindromeRecursive {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter string : ");
        String input = s.nextLine();
        boolean ans = isPalindrome(input);
        System.out.print("Output : " + ans);
        s.close();

    }

    public static boolean isPalindrome(String input) {
        return isPalindromeHelper(input, 0, input.length() - 1);
    }

    public static boolean isPalindromeHelper(String input, int si, int ei) {
        if (si >= ei) {
            return true;
        }

        if (input.charAt(si) != input.charAt(ei)) {
            return false;
        }
        return isPalindromeHelper(input, si + 1, ei - 1);
    }
}