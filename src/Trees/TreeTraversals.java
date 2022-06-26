package Trees;

public class TreeTraversals {
public static class TreeNode
{
	private int data;
	private TreeNode left;
	private TreeNode right;
	public TreeNode(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeNode root=new TreeNode(1);
TreeNode first=new TreeNode(2);
TreeNode second=new TreeNode(4);
TreeNode three=new TreeNode(5);
TreeNode four=new TreeNode(3);
root.left=first;
root.right=four;
first.left=second;
first.right=three;
printInorderTraversal(root);
printPreOrderTraversal(root);
printPostOrderTraversal(root);
	}
	private static void printPostOrderTraversal(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null)
		{
			return;
		}
		printPostOrderTraversal(root.left);
		printPostOrderTraversal(root.right);
		System.out.println(root.data);
		
	}
	private static void printPreOrderTraversal(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null)
		{
			return;
		}
		System.out.println(root.data);
		printPreOrderTraversal(root.left);
		printPreOrderTraversal(root.right);
		
	}
	private static void printInorderTraversal(TreeNode root) {
		if(root==null)
		{
			return;
		}
		// TODO Auto-generated method stub
		printInorderTraversal(root.left);
		System.out.println(root.data);
		printInorderTraversal(root.right);
	}

}
