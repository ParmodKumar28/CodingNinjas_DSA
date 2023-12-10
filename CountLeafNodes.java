// Count leaf Nodes
// Send Feedback
// Given a generic tree, count and return the number of leaf nodes present in
// the given tree. A node is said to be a leaf node if it's not having any child

// Leaf nodes in the given tree are 40, 50, 30, 40. So the answer for this is 4.
// Input format :
// Elements in level order form separated by space (as per done in class). Order
// is -
// Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element
// Output Format :
// Count of leaf nodes
// Sample Input 1 :
// 10 3 20 30 40 2 40 50 0 0 0 0
// Sample Output 1 :
// 4

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

    public static int countLeafNodes(TreeNode<Integer> root) {

        // Write your code here
        if (root == null) {
            return 0;
        }

        int leaves = 0;
        if (root.children.size() == 0) {
            leaves++;
        }

        for (int i = 0; i < root.children.size(); i++) {
            leaves += countLeafNodes(root.children.get(i));
        }

        return leaves;
    }

}
