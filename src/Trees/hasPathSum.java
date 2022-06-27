package Trees;

public class hasPathSum {
public static class TreeNode
{
	private int data;
	private TreeNode left;
	private TreeNode right;
	public TreeNode (int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeNode root=new TreeNode(1);
TreeNode left=new TreeNode(2);
TreeNode three=new TreeNode(3);
root.left=left;
root.right=three;
System.out.println(hasPathSum(root, 3));
	}
	private static boolean hasPathSum(TreeNode root, int sum) {
		// TODO Auto-generated method stub
if(root==null)
{
	return false;
}
else if(root.left==null && root.right==null && (sum-root.data==0))
{
	return true;
}
return (hasPathSum(root.left,sum-root.data) || hasPathSum(root.right,sum-root.data));

	}

}
