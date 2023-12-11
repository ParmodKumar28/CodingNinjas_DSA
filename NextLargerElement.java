// Next larger element
// Send Feedback
// Given a generic tree and an integer n. Find and return the node with next
// larger element in the Tree i.e. find a node with value just greater than n.
// Return NULL if no node is present with value greater than n.

// Input format :
// Line 1 : Integer n
// Line 2 : Elements in level order form separated by space (as per done in
// class) in the given below order
// node_data, n(number of children of node), n children, and so on for every
// element
// Output format :
// Node with value just greater than n.
// Sample Input 1 :
// 18
// 10 3 20 30 40 2 40 50 0 0 0 0
// Representation of Input

// Sample Output 1 :
// 20
// Explanation
// In the given tree, the value which is just greater than 18 is 20.
// Sample Input 2 :
// 21
// 10 3 20 30 40 2 40 50 0 0 0 0
// Sample Output 2:
// 30

class Node {
    int minDifference = Integer.MAX_VALUE;
    TreeNode<Integer> minDifferenceNode = null;
}

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

    public static void helper(TreeNode<Integer> root, int n, Node node) {
        if (root == null) {
            return;
        }

        int currentDifference = root.data - n;
        if (currentDifference > 0 && currentDifference < node.minDifference) {
            node.minDifference = currentDifference;
            node.minDifferenceNode = root;
        }

        for (TreeNode<Integer> childNode : root.children) {
            helper(childNode, n, node);
        }
    }

    public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n) {

        // Write your code here
        if (root == null) {
            return null;
        }

        Node node = new Node();
        helper(root, n, node);

        return node.minDifferenceNode;
    }

}
