// Pair Star
// Send Feedback
// Given a string S, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".
// Input format :
// String S
// Output format :
// Modified string
// Constraints :
// 0 <= |S| <= 1000
// where |S| represents length of string S.
// Sample Input 1 :
// hello
// Sample Output 1:
// hel*lo
// Sample Input 2 :
// aaaa
// Sample Output 2 :
// a*a*a*a

import java.util.Scanner;

public class PairStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = sc.nextLine();
        String ans = addStars(s);
        System.out.println("Output : " + ans);
        sc.close();
    }

    public static String addStars(String s) {
        if(s.length()==0||s==null)
        {
            return "";
        }
        return addStarsHelper(s, 0);

    }

    public static String addStarsHelper(String s, int si)
    {
        if(si==s.length()-1)
        {
            return String.valueOf(s.charAt(si));
        }
        if(s.charAt(si)==s.charAt(si+1))
        {
            return s.charAt(si) + "*" + addStarsHelper(s, si+1);
        }
        else
        {
            return s.charAt(si) + addStarsHelper(s, si+1);
        }
    }
}
