// Sum Of Array
// Send Feedback
// Given an array of length N, you need to find and return the sum of all elements of the array.
// Do this recursively.
// Input Format :
// Line 1 : An Integer N i.e. size of array
// Line 2 : N integers which are elements of the array, separated by spaces
// Output Format :
// Sum
// Constraints :
// 1 <= N <= 10^3
// Sample Input 1 :
// 3
// 9 8 9
// Sample Output 1 :
// 26
// Sample Input 2 :
// 3
// 4 2 1
// Sample Output 2 :
// 7  

import java.util.Scanner;

public class SumOfArray {

    public static void takeInput(int input[], int n, Scanner s)
    {
        System.out.println("Enter values of the array : ");
        for(int i=0;i<n;i++)
        {
            input[i] = s.nextInt();
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length of the array : ");
        int n = s.nextInt();
        int input[] = new int[n];
        takeInput(input, n, s);
        int ans = sum(input);
        System.out.println("Output : " + ans);
        s.close();
    }

    public static int sumHelper(int input[],int n)
    {
        if(n==input.length)
        {
            return 0;
        }

        int sum = 0;
        sum += input[n];
        return sum + sumHelper(input, n+1);
    }

    public static int sum(int input[])
    {
        return sumHelper(input,0);
    }
}
