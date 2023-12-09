// Print Tree Level-wise
// Send Feedback
// Given a generic tree, print the input tree in level wise order. That is,
// print the elements at same level in one line (separated by space). Print
// different levels in different lines.

// The output for the above tree should be
// 10
// 20 30 40
// 40 50
// Input format :
// Elements in level order form separated by space (as per done in class). Order
// is -
// Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element
// Output Format :
// Level wise print
// Sample Input :
// 10 3 20 30 40 2 40 50 0 0 0 0
// Sample Output :
// 10
// 20 30 40
// 40 50

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    /*
     * TreeNode structure
     * 
     * class TreeNode<T> {
     * T data;
     * ArrayList<TreeNode<T>> children;
     * 
     * TreeNode(T data){
     * this.data = data;
     * children = new ArrayList<TreeNode<T>>();
     * }
     * }
     */

    public static void printLevelWise(TreeNode<Integer> root) {
        /*
         * Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Print output and don't return it.
         * Taking input is handled automatically.
         */
        if (root == null) {
            return;
        }

        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        System.out.println(root.data);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode<Integer> current = queue.poll();
                for (int j = 0; j < current.children.size(); j++) {
                    System.out.print(current.children.get(j).data + " ");
                    queue.add(current.children.get(j));
                }
            }
            System.out.println();

        }

    }

}
