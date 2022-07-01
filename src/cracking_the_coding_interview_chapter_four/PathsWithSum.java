package cracking_the_coding_interview_chapter_four;

import cracking_the_coding_interview_chapter_four.validateBst.TreeNode;

public class PathsWithSum {
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
		TreeNode right=new TreeNode(1);
		root.left=left;
		root.right=right;
		System.out.println(pathSum(root, 3));
	}
	private static int pathSum(TreeNode root, int i) {
		// TODO Auto-generated method stub
		if(root==null)
		{
			return 0;
		}
		return pathfromSum(root,i)+pathfromSum(root.left,i)+pathfromSum(root.right,i);
	}
	private static int pathfromSum(TreeNode root, int i) {
		// TODO Auto-generated method stub
		if(root==null)
		{
			return 0;
		}
		return ((root.data==i?1:0) + (pathfromSum(root.left, i-root.data)) + (pathfromSum(root.right, i-root.data)));
	}

}
