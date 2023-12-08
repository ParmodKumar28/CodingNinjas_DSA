
// Level wise linkedlist
// Send Feedback
// Given a binary tree, write code to create a separate linked list for each
// level. You need to return the array which contains head of each level linked
// list.
// Input format :
// The first line of input contains data of the nodes of the tree in level order
// form. The data of the nodes of the tree is separated by space. If any node
// does not have left or right child, take -1 in its place. Since -1 is used as
// an indication whether the left or right nodes exist, therefore, it will not
// be a part of the data of any node.
// Output format :
// Each level linked list is printed in new line (elements are separated by
// space).
// Constraints:
// Time Limit: 1 second
// Sample Input 1:
// 5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
// Sample Output 1:
// 5
// 6 10
// 2 3
// 9
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    /*
     * BinaryTreeNode class
     * 
     * class BinaryTreeNode<T>
     * {
     * T data;
     * BinaryTreeNode<T> left;
     * BinaryTreeNode<T> right;
     * public BinaryTreeNode(T data)
     * {
     * this.data = data;
     * }
     * }
     */
    /*
     * LinkedListNode Class
     * class LinkedListNode<T>
     * {
     * T data;
     * LinkedListNode<T> next;
     * public LinkedListNode(T data)
     * {
     * this.data = data;
     * }
     * }
     */
    public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root) {
        // Write your code here
        ArrayList<LinkedListNode<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            LinkedListNode<Integer> levelHead = null;
            LinkedListNode<Integer> levelTail = null;

            for (int i = 0; i < levelSize; i++) {
                BinaryTreeNode<Integer> current = queue.poll();
                LinkedListNode<Integer> newNode = new LinkedListNode<>(current.data);
                if (levelHead == null) {
                    levelHead = newNode;
                    levelTail = newNode;
                } else {
                    levelTail.next = newNode;
                    levelTail = levelTail.next;
                }
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
            result.add(levelHead);
        }
        return result;
    }

}