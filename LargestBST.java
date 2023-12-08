// Largest BST
// Send Feedback
// Given a Binary tree, find the largest BST subtree. That is, you need to find
// the BST with maximum height in the given binary tree. You have to return the
// height of largest BST.
// Note :
// The binary tree will be consisting of only unique elements.
// Input format :
// The first line of input contains data of the nodes of the tree in level order
// form. The data of the nodes of the tree is separated by space. If any node
// does not have left or right child, take -1 in its place. Since -1 is used as
// an indication whether the left or right nodes exist, therefore, it will not
// be a part of the data of any node.
// Output format:
// The first and only line of output contains the height of the largest BST.
// Constraints:
// 1 ≤ Number of nodes ≤ 10^5
// 1 ≤ Data of a node ≤ 10^6
// Time Limit: 1 second
// Sample Input 1:
// 5 10 6 2 3 -1 -1 -1 -1 -1 9 -1 -1

// Sample Output 1:
// 2

class NodeValue {
    public int minNode, maxNode, height;
    public boolean isBST;

    public NodeValue(int minNode, int maxNode, int height, boolean isBST) {
        this.minNode = minNode;
        this.maxNode = maxNode;
        this.height = height;
        this.isBST = isBST;
    }
}

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

    public static NodeValue largestBSTSubtreeHelper(BinaryTreeNode<Integer> root) {
        // An empty tree is a BST of size 0.
        if (root == null) {
            return new NodeValue(Integer.MAX_VALUE, Integer.MIN_VALUE, 0, true);
        }

        // Get values from left and right subtree from current tree.
        NodeValue left = largestBSTSubtreeHelper(root.left);
        NodeValue right = largestBSTSubtreeHelper(root.right);

        // Current node is greater than max in left and smaller than the min in right ,
        // It is a BST.
        if (left.isBST && right.isBST && left.maxNode < root.data && root.data < right.minNode) {
            int height = Math.max(left.height, right.height) + 1;
            // It is a BST.
            return new NodeValue(
                    Math.min(root.data, left.minNode),
                    Math.max(root.data, right.maxNode),
                    height,
                    true);
        }

        // Otherwise, return [-inf, inf] so that parent can't be a valid BST.
        return new NodeValue(Integer.MIN_VALUE, Integer.MAX_VALUE, Math.max(left.height, right.height), false);
    }

    public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
        // Write your code here
        return largestBSTSubtreeHelper(root).height;
    }

}