// Sum of digits (recursive)
// Send Feedback
// Write a recursive function that returns the sum of the digits of a given integer.
// Input format :
// Integer N
// Output format :
// Sum of digits of N
// Constraints :
// 0 <= N <= 10^9
// Sample Input 1 :
// 12345
// Sample Output 1 :
// 15
// Sample Input 2 :
// 9
// Sample Output 2 :
// 9

import java.util.Scanner;

/**
 * SumOfDigitsRecursive
 */
public class SumOfDigitsRecursive {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number : ");
        int input = s.nextInt();
        int ans = sumOfDigits(input);
        System.out.println("Output : " + ans);
        s.close();

    }

    public static int sumOfDigits(int input)
    {
        if(input <= 0)
        {
            return 0;
        }
        int digit = input%10;

        return digit + sumOfDigits(input/10);
        
    }
}