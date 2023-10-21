// Remove X
// Send Feedback
// Given a string, compute recursively a new string where all 'x' chars have been removed.
// Input format :
// String S
// Output format :
// Modified String
// Constraints :
// 1 <= |S| <= 10^3
// where |S| represents the length of string S. 
// Sample Input 1 :
// xaxb
// Sample Output 1:
// ab
// Sample Input 2 :
// abc
// Sample Output 2:
// abc
// Sample Input 3 :
// xx
// Sample Output 3:

import java.util.Scanner;

public class RemoveX {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter String : ");
        String input = s.nextLine();
        String ans = removeX(input);
        System.out.print("Output : " + ans);
        s.close();
    }

    public static String removeX(String input) {
        if (input.length() == 0) {
            return "";
        }
        String ans = "";
        if (input.charAt(0) != 'x') {
            ans += input.charAt(0);
        }
        String str = "";
        for (int i = 1; i < input.length(); i++) {
            str += input.charAt(i);
        }
        return ans + removeX(str);
    }
}
