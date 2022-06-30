package cracking_the_coding_interview_chapter_four;

import cracking_the_coding_interview_chapter_four.checkBalanced.TreeNode;

public class checkSubtree {
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
		TreeNode left=new TreeNode(4);
		TreeNode right=new TreeNode(5);
		TreeNode leftchild1=new TreeNode(1);
		TreeNode leftchild2=new TreeNode(2);
		root.left=left;
		root.right=right;
		left.left=leftchild1;
		left.right=leftchild2;
		TreeNode root1=new TreeNode(4);
		TreeNode left1=new TreeNode(1);
		TreeNode right1=new TreeNode(2);
		root1.left=left1;
		root1.right=right1;
	System.out.println(	isSubtree(root,root1));
		
	}
	private static boolean isSubtree(TreeNode s, TreeNode t) {
		// TODO Auto-generated method stub
		if(s==null)
		{
			return false;
		}
		if(t==null)
		{
			return true;
		}
		if(isIdentical(s,t))
		{
			return true;
		}
		return(isSubtree(s.left,t) || isSubtree(s.right,t));
		
		
	}
	private static boolean isIdentical(TreeNode s, TreeNode t) {
		// TODO Auto-generated method stub
		if(s==null && t==null)
		{
			return true;
		}
		if(s==null || t==null)
		{
			return false;
		}
		if(s.data!=t.data)
		{
			return false;
		}
		return (isIdentical(s.left,t.left) && isIdentical(s.right,t.right));
	}

}
