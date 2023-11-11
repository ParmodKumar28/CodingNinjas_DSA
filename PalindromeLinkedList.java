// Palindrome Linked List
// Send Feedback
// You have been given a head to a singly linked list of integers. Write a
// function check to whether the list given is a 'Palindrome' or not.
// Input format :
// The first line contains an Integer 't' which denotes the number of test cases
// or queries to be run. Then the test cases follow.

// First and the only line of each test case or query contains the the elements
// of the singly linked list separated by a single space.
// Remember/Consider :
// While specifying the list elements for input, -1 indicates the end of the
// singly linked list and hence, would never be a list element.
// Output format :
// For each test case, the only line of output that print 'true' if the list is
// Palindrome or 'false' otherwise.
// Constraints :
// 1 <= t <= 10^2
// 0 <= M <= 10^5
// Time Limit: 1sec

// Where 'M' is the size of the singly linked list.
// Sample Input 1 :
// 1
// 9 2 3 3 2 9 -1
// Sample Output 1 :
// true
// Sample Input 2 :
// 2
// 0 2 3 2 5 -1
// -1
// Sample Output 2 :
// false
// true
// Explanation for the Sample Input 2 :
// For the first query, it is pretty intuitive that the the given list is not a
// palindrome, hence the output is 'false'.

// For the second query, the list is empty. An empty list is always a palindrome
// , hence the output is 'true'.

import java.util.Stack;

/*

	Following is the Node class already written for the Linked List

	class Node<T> {
    	T data;
    	Node<T> next;
    
    	public Node(T data) {
        	this.data = data;
    	}
	}

*/

class Solution {

    public static boolean isPalindrome(Node<Integer> head) {
        // Your code goes here
        if (head == null || head.next == null) {
            return true;
        }
        Stack<Integer> st = new Stack<>();

        Node<Integer> temp = head;
        while (temp != null) {
            st.add(temp.data);
            temp = temp.next;
        }

        while (head != null) {
            if (st.pop() != head.data) {
                return false;
            }
            head = head.next;
        }

        return true;

    }

}