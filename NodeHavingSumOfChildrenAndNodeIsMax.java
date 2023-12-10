// Node having sum of children and node is max
// Send Feedback
// Given a tree, find and return the node for which sum of data of all children
// and the node itself is maximum. In the sum, data of node itself and data of
// immediate children is to be taken.
// Input format :

// Line 1 : Elements in level order form separated by space (as per done in
// class). Order is -

// Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element

// Output format : Node with maximum sum.

// Sample Input 1 :
// 5 3 1 2 3 1 15 2 4 5 1 6 0 0 0 0
// Representation of input

// Sample Output 1 :
// 1
// Explanation
// Sum of node 1 and it's child (15) is maximum among all the nodes, so the
// output for this is 1.

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

    public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root) {
        // Write your code here
        if (root == null) {
            return null;
        }

        int maxSum = sum(root);
        TreeNode<Integer> maxSumNode = root;
        for (int i = 0; i < root.children.size(); i++) {
            TreeNode<Integer> childNode = maxSumNode(root.children.get(i));
            int childSum = sum(childNode);
            if (childSum > maxSum) {
                maxSum = childSum;
                maxSumNode = childNode;
            }
        }
        return maxSumNode;

    }

    private static int sum(TreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int childSum = 0;
        childSum += root.data;
        for (int i = 0; i < root.children.size(); i++) {
            childSum += root.children.get(i).data;
        }
        return childSum;
    }

}
