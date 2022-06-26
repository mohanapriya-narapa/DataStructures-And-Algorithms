package Trees;

public class IsSameTree {
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
TreeNode root1=new TreeNode(1);
TreeNode left1=new TreeNode(2);
TreeNode right1=new TreeNode(1);
TreeNode root2=new TreeNode(1);
TreeNode left2=new TreeNode(2);
TreeNode right2=new TreeNode(1);
root1.left=left1;
root1.right=right1;
root2.left=left2;
root2.right=right2;
System.out.println(isSameTree(root1,root2));
	}
	private static boolean isSameTree(TreeNode root1, TreeNode root2) {
		// TODO Auto-generated method stub
		if(root1==null && root2!=null)
		{
			return false;
		}
		if(root2==null && root1!=null)
		{
			return false;
		}
		if(root2==null && root1==null)
		{
			return true;
		}
		if(root1.data!=root2.data)
		{
			return false;
		}
		return (isSameTree(root1.left,root2.left) && isSameTree(root1.right,root2.right) );
	}

}
