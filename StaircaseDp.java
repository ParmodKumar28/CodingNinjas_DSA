// Staircase
// Moderate
// Score
// 0/400
// Average time to solve is 40m
// Problem statement
// A child runs up a staircase with 'n' steps and can hop either 1 step, 2 steps
// or 3 steps at a time. Implement a method to count and return all possible
// ways in which the child can run-up to the stairs.

// Detailed explanation ( Input/output format, Notes, Images )
// Input format :
// The first and the only line of input contains an integer value, 'n', denoting
// the total number of steps.
// Output format :
// Print the total possible number of ways.
// Constraints :
// 0 <= n <= 10 ^ 4

// Time Limit: 1 sec
// Sample Input 1:
// 4
// Sample Output 1:
// 7
// Sample Input 2:
// 10
// Sample Output 2:
// 274

public class Solution {

    public static long staircase(int n) {
        // Your code goes here

        // Creating the dp array
        long dp[] = new long[n + 1];

        // Initializing one step
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1]; // for taking one steps

            if (i >= 2) {
                dp[i] += dp[i - 2]; // for taking two steps
            }

            if (i >= 3) {
                dp[i] += dp[i - 3]; // for taking three steps
            }
        }

        return dp[n];
    }

}