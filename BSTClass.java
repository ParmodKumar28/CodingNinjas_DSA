/*
 * Binary Tree Node class
 * 
 * class BinaryTreeNode<T> { 
 * 		T data; 
 * 		BinaryTreeNode<T> left; 
 * 		BinaryTreeNode<T> right;
 * 		public BinaryTreeNode(T data) 
 * 		{ 
 * 			this.data = data; 
 * 		}
 * }
 */

 /* 
 * Main Method being used internally
 *	public static void main(String[] args) throws IOException {
 *		BinarySearchTree bst = new BinarySearchTree();
 *		int choice, input;
 *		int q = Integer.parseInt(br.readLine());
 *		while (q-- > 0) {
 *			st = new StringTokenizer(br.readLine());
 *			choice = Integer.parseInt(st.nextToken());
 *			switch (choice) {
 *			case 1:
 *				input = Integer.parseInt(st.nextToken());
 *				bst.insert(input);
 *				break;
 *				case 2:
 *				input = Integer.parseInt(st.nextToken());
 *				bst.remove(input);
 *				break;
 *			case 3:
 *				input = Integer.parseInt(st.nextToken());
 *				System.out.println(bst.search(input));
 *				break;
 *			default:
 *				bst.printTree();
 *				break;
 *			}
 *		}
 *	}
 */

public class BinarySearchTree {
	BinaryTreeNode<Integer> root;
	int size;

	public static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> root, int data)
	{
		if(root==null)
		{
			BinaryTreeNode<Integer> newNode = new BinaryTreeNode<>(data);
			return newNode;
		}
		if(data>root.data)
		{
			root.right = insertHelper(root.right, data);
		}
		else
		{
			root.left = insertHelper(root.left, data);
		}
		return root;
	}
	public void insert(int data) {
		//Implement the insert() function
		root = insertHelper(root, data);
	}
	
	public static BinaryTreeNode<Integer> removeHelper(BinaryTreeNode<Integer>root,int data)
	{

		if(root==null)
		{
			return null;
		}

		if(data<root.data)
		{
			root.left = removeHelper(root.left, data);
			return root;
		}
	
		else if(data>root.data)
		{
			root.right = removeHelper(root.right, data);
			return root;
		}

		else

		{
			if(root.left==null&&root.right==null)
			{
				return null;
			}
			else if(root.left==null)
			{
				return root.right;
			}
			else if(root.right==null)
			{
				return root.left;
			}

			else
			{
				BinaryTreeNode<Integer> minNode= root.right;
				while(minNode.left!=null)
				{
					minNode=minNode.left;
				}
				root.data=minNode.data;
				root.right=removeHelper(root.right, minNode.data);
				return root;
			}
		}
		
	}
	public void remove(int data) {
		//Implement the remove() function
		root = removeHelper(root,data);

	}
	
	public static void printTreeHelper(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		System.out.print(root.data+":");
		if(root.left!=null)
		{
			System.out.print("L:"+root.left.data+",");
		}
		if(root.right!=null)
		{
			System.out.print("R:"+root.right.data);
		}
		System.out.println();
		printTreeHelper(root.left);
		printTreeHelper(root.right);
	}
	public void printTree() {
		//Implement the printTree() function
		printTreeHelper(root);
	}
	

	public static boolean searchHelper(BinaryTreeNode<Integer> root, int data)
	{
		if(root==null)
		{
			return false;
		}

		if(root.data==data)
		{
			return true;
		}

		if(root.data<data)
		{
			return searchHelper(root.right,data);
		}
		else
		{
			return searchHelper(root.left, data);
		}
	}
	public boolean search(int data) {
		//Implement the search() function
		return searchHelper(root, data);

	}
	

}