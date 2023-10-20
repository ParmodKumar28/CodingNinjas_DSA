// Check Number in Array
// Send Feedback
// Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.
// Do this recursively.
// Input Format :
// Line 1 : An Integer N i.e. size of array
// Line 2 : N integers which are elements of the array, separated by spaces
// Line 3 : Integer x
// Output Format :
// 'true' or 'false'
// Constraints :
// 1 <= N <= 10^3
// Sample Input 1 :
// 3
// 9 8 10
// 8
// Sample Output 1 :
// true
// Sample Input 2 :
// 3
// 9 8 10
// 2
// Sample Output 2 :
// false

import java.util.Scanner;

public class CheckNumberInArray {

    public static void takeInput(int input[], int n, Scanner s) {
        System.out.println("Enter values of the array : ");
        for (int i = 0; i < n; i++) {
            input[i] = s.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length of the array : ");
        int n = s.nextInt();
        int input[] = new int[n];
        takeInput(input, n, s);
        System.out.println("Enter x : ");
        int x = s.nextInt();
        boolean ans = checkNumber(input, x);
        System.out.println("Output : " + ans);
        s.close();
    }

    public static boolean checkNumber(int input[], int x)
    {
        return checkNumberHelper(input, x, 0);
    }

    public static boolean checkNumberHelper(int input[], int x, int n)
    {
        if(n==input.length)
        {
            return false;
        }

        if(input[n]==x)
        {
            return true;
        }

        return checkNumberHelper(input, x, n+1);
    }
}
