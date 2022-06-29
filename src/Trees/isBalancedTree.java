package Trees;

public class isBalancedTree {
public static class TreeNode
{
	public int data;
	public TreeNode left;
	public TreeNode right;
	public TreeNode(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(3);
		TreeNode left=new TreeNode(9);
		TreeNode right=new TreeNode(20);
		TreeNode rightchild1=new TreeNode(15);
		TreeNode rightchild2=new TreeNode(7);
		root.left=left;
		root.right=right;
		right.left=rightchild1;
		right.right=rightchild2;
		System.out.println(isBalanced(root));
	}

	private static boolean isBalanced(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null)
		{
			return true;
		}
		int lh=height(root.left);
		int rh=height(root.right);
		return (Math.abs(lh-rh)<=1 && isBalanced(root.left) && isBalanced(root.right) );
	}

	private static int height(TreeNode root) {
		// TODO Auto-generated method stub
	if(root==null)
	{
		return 0;
	}
	int left=height(root.left);
	int right=height(root.right);
	return (Math.max(left,right)+1);
	}

}
