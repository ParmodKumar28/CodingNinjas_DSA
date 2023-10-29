// Multiplication (Recursive)
// Send Feedback
// Given two integers M & N, calculate and return their multiplication using recursion. You can only use subtraction and addition for your calculation. No other operators are allowed.
// Input format :
// Line 1 : Integer M
// Line 2 : Integer N
// Output format :
// M x N
// Constraints :
// 0 <= M <= 1000
// 0 <= N <= 1000
// Sample Input 1 :
// 3 
// 5
// Sample Output 1 :
// 15
// Sample Input 2 :
// 4 
// 0
// Sample Output 2 :
// 0

import java.util.Scanner;

public class MultiplicationRecursive {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int m = s.nextInt();
        System.out.println("Enter number 2 : ");
        int n = s.nextInt();
        int ans = multiplyTwoIntegers(m, n);
        System.out.println("Output : " + ans);
        s.close();
    }

    public static int multiplyTwoIntegers(int m, int n)
    {
        if(n==0)
        {
            return 0;
        }

        return m + multiplyTwoIntegers(m, n-1);
    }
}
