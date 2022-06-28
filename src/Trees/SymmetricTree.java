package Trees;

public class SymmetricTree {
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
		TreeNode root=new TreeNode(1);
		TreeNode first=new TreeNode(2);
		TreeNode second=new TreeNode(3);
		TreeNode third=new TreeNode(4);
		root.left=first;
		first.left=second;
		first.right=third;
		TreeNode first1=new TreeNode(2);
		TreeNode second1=new TreeNode(4);
		TreeNode third1=new TreeNode(3);
		root.right=first1;
		first1.left=second1;
		first1.right=third1;
		System.out.println(isSymmetric(root,root));
	}
	private static boolean isSymmetric(TreeNode root, TreeNode root2) {
		// TODO Auto-generated method stub
		if(root==null && root2==null)
		{
			return true;
		}
		if(root==null || root2==null)
		{
			return false;
		}
		if(root.data!=root2.data)
		{
			return false;
		}
		return (isSymmetric(root.left,root2.right) && isSymmetric(root.right,root2.left));
		
	}

}
