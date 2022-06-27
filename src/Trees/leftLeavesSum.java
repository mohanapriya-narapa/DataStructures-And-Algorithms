package Trees;

public class leftLeavesSum {
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
TreeNode root=new TreeNode(3);
TreeNode first=new TreeNode(9);
TreeNode second=new TreeNode(20);
TreeNode third=new TreeNode(15);
TreeNode fourth=new TreeNode(7);
root.left=first;
root.right=second;
second.left=third;
second.right=fourth;
System.out.println(sumOfLeftLeaves(root));
	}

	private static int sumOfLeftLeaves(TreeNode root) {
		int sum=0;
		// TODO Auto-generated method stub
		if(root==null)
		{
			return 0;
		}
		if(root.left!=null && root.left.left==null && root.left.right==null)
		{
			sum+=root.left.data;
		}
		return sum;
	}

}
