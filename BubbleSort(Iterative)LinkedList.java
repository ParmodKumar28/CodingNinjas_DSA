// Bubble Sort (Iterative) Linked List
// Send Feedback
// Given a singly linked list of integers, sort it using 'Bubble Sort.'
// Note :
// No need to print the list, it has already been taken care. Only return the
// new head to the list.
// Input format :
// The first and the only line of each test case or query contains the elements
// of the singly linked list separated by a single space.
// Remember/Consider :
// While specifying the list elements for input, -1 indicates the end of the
// singly linked list and hence, would never be a list element
// Output format :
// For each test case/query, print the elements of the sorted singly linked
// list.

// Output for every test case will be printed in a seperate line.
// Constraints :
// 0 <= M <= 10^3
// Where M is the size of the singly linked list.

// Time Limit: 1sec
// Sample Input 1 :
// 10 9 8 7 6 5 4 3 -1
// Sample Output 1 :
// 3 4 5 6 7 8 9 10
// Sample Input 2 :
// 10 -5 9 90 5 67 1 89 -1
// Sample Output 2 :
// -5 1 5 9 10 67 89 90

// Following is the Node class already written for the Linked List

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}

class Solution {

    public static Node<Integer> bubbleSort(Node<Integer> head) {
        // Your code goes here
        if (head == null || head.next == null) {
            return head;
        }

        boolean swapped = true;

        while (swapped) {
            swapped = false;
            Node<Integer> current = head;
            Node<Integer> next = current.next;

            while (next != null) {
                if (current.data > next.data) {
                    int temp = current.data;
                    current.data = next.data;
                    next.data = temp;
                    swapped = true;
                }
                current = next;
                next = current.next;
            }
        }
        return head;
    }
}