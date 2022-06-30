package cracking_the_coding_interview_chapter_four;

import cracking_the_coding_interview_chapter_four.checkBalanced.TreeNode;

public class validateBst {
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
		TreeNode root=new TreeNode(2);
		TreeNode left=new TreeNode(1);
		TreeNode right=new TreeNode(6);
		root.left=left;
		root.right=right;
		System.out.println(isValidBST(root, Integer.MIN_VALUE,Integer.MAX_VALUE ));
	}

	private static boolean isValidBST(TreeNode root,int min,int max) {
		// TODO Auto-generated method stub
if(root==null)
{
	return true;
}
if(root.data<min || root.data>max)
{
	return false;
}
return (isValidBST(root.left,min, root.data-1) && isValidBST(root.right,root.data+1, max) );
	}

}
