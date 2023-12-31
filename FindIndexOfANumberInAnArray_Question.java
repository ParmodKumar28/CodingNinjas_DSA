// First Index Of a Number in an Array - Question
// Send Feedback
// Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
// First index means, the index of first occurrence of x in the input array.
// Do this recursively. Indexing in the array starts from 0.
// Input Format :
// Line 1 : An Integer N i.e. size of array
// Line 2 : N integers which are elements of the array, separated by spaces
// Line 3 : Integer x
// Output Format :
// first index or -1
// Constraints :
// 1 <= N <= 10^3
// Sample Input :
// 4
// 9 8 10 8
// 8
// Sample Output :
// 1

import java.util.Scanner;

/**
 * FindIndexOfANumberInAnArray_Question
 */
public class FindIndexOfANumberInAnArray_Question {
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
        int ans = firstIndex(input, x);
        System.out.println("Output : " + ans);
        s.close();
    }

    public static int firstIndex(int input[], int x) {
        if (input.length == 0) {
            return -1;
        }

        if (input[0] == x) {
            return 0;
        }

        int arr[] = new int[input.length - 1];
        for (int i = 1; i < input.length; i++) {
            arr[i - 1] = input[i];
        }
        int fi = firstIndex(arr, x);
        if (fi == -1) {
            return -1;
        } else {
            return fi + 1;
        }
    }

}